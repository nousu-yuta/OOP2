package lesson02;

public class Practice2_001 {
    public static void main(String[] args) {
        int num1 = 0b1101;
        int num2 = 064;
        int num3 = 0xA6;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        String num4 = Integer.toHexString(31);
        String num5 = Integer.toString(19, 9);
        System.out.println(num4);
        System.out.println(num5);
    }

}
