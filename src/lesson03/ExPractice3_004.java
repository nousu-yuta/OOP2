package lesson03;

public class ExPractice3_004 {
    public static void main(String[] args) {
        String fstr = "こんにちは";
        //定数を宣言
        final String TSTR = "こんにちは";
        String nstr = null;
        if (fstr != null && TSTR.equals(fstr) && fstr != nstr) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
