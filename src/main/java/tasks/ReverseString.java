package tasks;

import java.util.Scanner;

public class ReverseString {
   public static String reverse(String origin) {
        if(origin.length() == 0)
            return " ";
        return origin.charAt(origin.length()-1) + reverse(origin.substring(0,origin.length()-1));
    }


    public static void main(String[ ] arg) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string=scanner.nextLine();
        System.out.println("Reverse of a String: "+reverse(string));
    }
}
