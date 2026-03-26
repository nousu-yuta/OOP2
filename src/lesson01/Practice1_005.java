package lesson01;

public class Practice1_005 {
    public static void main(String[] args) {
        byte num1 = 127;
        short num2 = 128;
        short num3 = 32767;
        int num4 = 32768;
        int num5 = 2147483647;
        long num6 = 2147483648l;
        long num7 = 9223372036854775807l;
        long num8 = 9223372036854775807l;
        System.out.println(num1);
        System.out.println(num3);
        System.out.println(num5);
        System.out.println(num7);

        byte num9 = 100;

        short num10 = num9;
        int num11 = num10;
        long num12 = num11;
        Integer num13 = Integer.parseInt("123456");
        System.out.println(num10);
        System.out.println(num11);
        System.out.println(num12);
        System.out.println(num13);

    }

}
