package lesson03;

public class Practice3_001 {
    public static void main(String[] args) {
        System.out.print("数値を入力してください：");
        int num = new java.util.Scanner(System.in).nextInt();
        if (num == 10) {
            System.out.println("10が入力されました");
        } else {
            System.out.println("10以外が入力されました");
        }
    }
}
