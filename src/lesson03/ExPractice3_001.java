package lesson03;

public class ExPractice3_001 {
    public static void main(String[] args) {
        System.out.print("数値を入力してください：");
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println((num == 10) ? "10が入力されました" : "10以外が入力されました");

    }
}
