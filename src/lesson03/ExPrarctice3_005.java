package lesson03;

public class ExPrarctice3_005 {
    public static void main(String[] args) {
        int age = 20;
        int grade = 4;
        int length = 9;

        if (fullAdd(age, grade, length) >= 33) {
            System.out.println("成功");
        }
        
        System.out.println(33 <= fullAdd(age, grade, length) ? "成功" : "失敗");

    }

    public static int fullAdd(int age, int grade, int length) {
        return age + grade + length;
    }
}
