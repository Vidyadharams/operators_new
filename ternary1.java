package opearations;

import java.util.Scanner;

public class ternary1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        String result = (num >= 0) ? "positive" : "negitive";

        System.out.println(num + " is " + result);
    }
}