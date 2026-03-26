package lesson03;

public class Practice3_005 {
    public static void main(String[] args) {
        int age = 20;
        int grade = 4;
        int length = 9;
        if ((age > 20) && (grade <= 3 || length < 10)) {
            System.out.println("失敗");
        } else {
            System.out.println("成功");
        }
    }
}
