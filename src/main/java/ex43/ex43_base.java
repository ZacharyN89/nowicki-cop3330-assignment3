package ex43;

import java.util.Scanner;

public class ex43_base {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        makeWebsite builder = new makeWebsite();
        builder.setFiles(askForName(),askForAuthor());
        boolean js = askJS();
        boolean css = askCSS();
        builder.makeDirectories(js,css);
        System.out.print(builder.makeHTML());
    }

    public static boolean askJS(){
        System.out.print("Do you want a folder for JavaScript? ");
        String check = in.nextLine();
        if(check.equals("y") || check.equals("Y")){
            return true;
        }else{
            return false;
        }
    }

    public static String askForName(){
        System.out.print("Site name: ");
        return in.nextLine();
    }

    public static String askForAuthor(){
        System.out.print("Author: ");
        return in.nextLine();
    }

    public static boolean askCSS(){
        System.out.print("Do you want a folder for CSS? ");
        String check = in.nextLine();
        if(check.equals("y") || check.equals("Y")){
            return true;
        }else{
            return false;
        }
    }
}
