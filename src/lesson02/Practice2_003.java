package lesson02;

public class Practice2_003 {
    public static void main(String[] args) {
        int numA;
        int numB;
        int numC = 2;
        int numD = 2;
        numA = numC++;
        numB = ++numD;
        System.out.println(numA);
        System.out.println(numB);

        int num1 = ~15;
        System.out.println(num1);
        int num2 = 6 | 3;
        System.out.println(num2);
        int num3 = 54 << 2;
        System.out.println(num3);
    }

}
