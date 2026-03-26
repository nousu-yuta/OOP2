package lesson05;

public class Practice5_015 {
    public static void main(String[] args) {
        execute(2);
    }

    public static int input() {
        System.out.println("2乗する値を入力してください");
        return new java.util.Scanner(System.in).nextInt();
    }

    public static int calculation(int num) {
        return num * num;
    }

    public static void output(int num, int result) {
        System.out.println(num + "の２乗は" + result + "です。");
    }

    public static void execute(int count) {
        for (int i = 0; i < count; i++) {
            int num = input();
            int result = calculation(num);
            output(num, result);
        }
    }
}
