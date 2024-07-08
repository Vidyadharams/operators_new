package opearations;

import java.util.Scanner;

public class unary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        System.out.println("Number:" + num);

        System.out.println("++num = " + (++num)); // Pre increment

        System.out.println("--num = " + (--num)); // Pre decrement

        System.out.println("num++ = " + (num++)); // Post increment
        System.out.println("After post increment :" + num);

        System.out.println("num-- = " + (num--)); // Post decrement
        System.out.println("After post decrement :" + num);

        System.out.println("+num = " + (+num)); // Unary positive operator

        System.out.println("-num = " + (-num)); // unary negative oerator
        boolean boo1 = (num > 0);
        System.err.println("!" + boo1 + " = " + (!boo1));
    }
}
