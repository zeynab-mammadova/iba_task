package tasks;

import java.util.Scanner;

public class ReverseString {
    String reverse(String origin)
    {
        if(origin.length() == 0)
            return " ";
        return origin.charAt(origin.length()-1) + reverse(origin.substring(0,origin.length()-1));
    }
    public static void main(String[ ] arg)
    {
        ReverseString rev=new ReverseString();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        System.out.println("Reverse of a String :"+rev.reverse(str));
    }
}
