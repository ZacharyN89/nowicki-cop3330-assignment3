package ex43;

import java.io.*;
public class makeWebsite {
    public void makeFiles(){

        String siteName = " ";
        String author;

        //Output to file.
        try{
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("./website/"+siteName+"/index.html"));

            File js = new File("./website/"+siteName+"/js/");
            if(js.createNewFile()){

            }else{

            }

            File css = new File("./website/"+siteName+"/csss/");
            if(css.createNewFile()){

            }else{

            }
        }catch(Exception ex){

        }
    }
}
