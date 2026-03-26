package lesson02;

public class Practice2_004_1 {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 4;
        System.out.println((double) num1 / num2);

        char character = '餅';
        System.out.println((int) character);

        Object obj = 13;
        if (obj instanceof Integer) {
            System.out.println(obj);
        }

    }
}
