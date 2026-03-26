package lesson03;

public class Practice3_006 {
    public static void main(String[] args) {
        System.out.print("点数を入力してください：");
        int num = new java.util.Scanner(System.in).nextInt();
        String grade = null;
        if (num >= 90) {
            grade = "秀";
            System.out.println("あなたは\"" + grade + "\"です");
        } else if (num >= 80) {
            grade = "優";
            System.out.println("あなたは\"" + grade + "\"です");
        } else if (num >= 70) {
            grade = "良";
            System.out.println("あなたは\"" + grade + "\"です");
        } else if (num >= 60) {
            grade = "可";
            System.out.println("あなたは\"" + grade + "\"です");
        } else {
            grade = "不可";
            System.out.println("あなたは\"" + grade + "\"です");
        }
    }
}
