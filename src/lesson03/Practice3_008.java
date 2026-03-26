package lesson03;

public class Practice3_008 {
    public static void main(String[] args) {
        System.out.print("繰り返し回数を入力してください：");
        int num = new java.util.Scanner(System.in).nextInt();
        int count = num;

        System.out.println("whileループ");
        while (count >= 0) {
            System.out.println(count);
            count--;
        }

        count = num;
        System.out.println("do-whileループ");
        do {
            System.out.println(count);
            count--;
        } while (count >= 0);

        count = num;
        System.out.println("forループ");
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
