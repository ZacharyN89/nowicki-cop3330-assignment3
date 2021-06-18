/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex43;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class makeWebsite {
    private String siteName;
    private String author;

    public void setFiles(String name, String authorName){
        siteName = name;
        author = authorName;
    }

    public void makeDirectories(boolean js, boolean css){
        //Make the directories.

        //Website folder.
        String websiteStr = "./website";
        Path websitePath = Paths.get(websiteStr);
        try {
            Files.createDirectory(websitePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Site folder.
        String nameStr = "./website/"+siteName;
        Path namePath = Paths.get(nameStr);
        try {
            Files.createDirectory(namePath);
            System.out.println("Created ./website/"+siteName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //JS folder.
        if(js){
            String jsDir = "./website/"+siteName+"/js/";
            System.out.println("Created ./website/"+siteName+"/js/");
            Path jsPath = Paths.get(jsDir);
            try {
                Files.createDirectory(jsPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //CSS folder.
        if(css){
            String cssDir = "./website/"+siteName+"/css/";
            System.out.println("Created ./website/"+siteName+"/css/");
            Path cssPath = Paths.get(cssDir);
            try {
                Files.createDirectory(cssPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String makeHTML(){
        //Make the file.
        File html = new File("./website/"+siteName+"/index.html");
        try{
            //Output to file.
            BufferedWriter bw = new BufferedWriter(new FileWriter(html));

            //Output text.
            bw.write("\n" +
                    "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n"+
                    "<title>"+siteName+"</title>\n"+
                    "<meta name=\"author\" content=\""+author+"\">\n"+
                    "</head>\n"+
                    "<body>\n" +
                    "<h1>My First Heading</h1>\n" +
                    "</body>\n" +
                    "</html>\n");

            //Close writer.
            bw.close();

            //Desktop.getDesktop().browse(html.toURI());

            return "Created ./website/"+siteName+"/index.html";
        }catch(Exception ex){
            return "Could not complete.";
        }
    }
}
