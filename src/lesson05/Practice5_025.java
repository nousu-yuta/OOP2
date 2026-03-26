package lesson05;

public class Practice5_025 {
    public static void main(String[] args) {
        dispinfo(5);
        dispinfo("Java");
    }

    public static void dispinfo(int num) {
        System.out.println("引数に入れた数値は" + num + "です");
    }

    public static void dispinfo(String str) {
        System.out.println("引数に入れた文字列は" + str + "です");
    }
}
