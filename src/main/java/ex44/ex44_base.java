package ex44;

import java.util.ArrayList;
import java.util.Scanner;

public class ex44_base {
    private static final Scanner in = new Scanner(System.in);
    private static listFinder test = new listFinder();

    public static void main(String[] args){
        test.parseJSON();
        printProduct(getName());
    }

    public static String askProduct(){
        System.out.print("What is the product name? ");
        return in.next();
    }

    public static ArrayList<String> getName(){
        while(true) {
            String find = askProduct();

            //Get the array.
            ArrayList<String> result = new ArrayList<>();
            result = test.findProductIndex(find);

            //If the ArrayList has been initialized then the product existed.
            if(result.size() == 3){
                return result;
            }

            //If it didn't find it then the product did not exist. Loop again and ask for a new product.
            System.out.println("Sorry, that product was not found in our inventory.");
        }
    }

    public static void printProduct(ArrayList<String> list){
        System.out.println("Name: "+list.get(0));
        System.out.println("Price: "+list.get(1));
        System.out.println("Quantity: "+list.get(2));
    }
}
