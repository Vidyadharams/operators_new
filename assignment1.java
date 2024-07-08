package opearations;

public class assignment1 {
    public static void main(String[] args) {
        int a = 21;
        int b = 10;
        System.out.println("sum=" + (a += b));
        System.out.println("sub=" + (a -= b));
        System.out.println("mul=" + (a *= b));
        System.out.println("div=" + (a /= b));
        System.out.println("mod=" + (a %= b));
    }
}
