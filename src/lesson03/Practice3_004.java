package lesson03;

public class Practice3_004 {
    public static void main(String[] args) {
        System.out.print("文字を入力してください：");
        String str = new java.util.Scanner(System.in, "SHIFT-JIS").nextLine();
        if (str.equals("こんにちは")) {
            System.out.println("こんにちは！");
        } else {
            System.out.println("挨拶してほしいです");
            System.out.print("数値を入力してください：");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == 10) {
                System.out.println("10です");
            } else {
                System.out.println("10以外です");
            }
        }

    }
}
