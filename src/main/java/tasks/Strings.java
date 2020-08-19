package tasks;

import java.util.Scanner;

public class Strings {


   public  static String result(String a, String b, String c) {
        return !a.equals("") ? a : !b.equals("") ? b : !c.equals("") ? c.substring(c.length() - 3) : "Nothing";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        System.out.println(result(a, b, c));
    }
}
