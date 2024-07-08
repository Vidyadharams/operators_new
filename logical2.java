package opearations;

import java.util.Scanner;

public class logical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the boolean value a (true/false): ");
        System.out.println("enter the boolean value d (true/false):");
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + !a);
        System.out.println("!b: " + !b);
    }
}