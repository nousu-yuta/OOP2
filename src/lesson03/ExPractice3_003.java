package lesson03;

public class ExPractice3_003 {
    public static void main(String[] args) {
        System.out.print("繰り返す回数を入力してください：");
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.print("足す値を入力してください：");
        int addNum = new java.util.Scanner(System.in).nextInt();

        ExPractice3_003Sum add = new ExPractice3_003Sum();
        add.sum(num, addNum);

    }
}
