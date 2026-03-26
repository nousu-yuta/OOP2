package lesson03;

public class Practice3_007 {
    public static void main(String[] args) {
        System.out.print("評価を入力してください：");
        String grade = new java.util.Scanner(System.in, "SHIFT-JIS").nextLine();

        switch (grade) {
            case "秀":
                System.out.println("あなたは90～100点を取りましたね？");
                break;
            case "優":
                System.out.println("あなたは80～89点を取りましたね？");
                break;
            case "良":
                System.out.println("あなたは70～79点を取りましたね？");
                break;
            case "可":
                System.out.println("あなたは60～69点を取りましたね？");
                break;
            case "不可":
                System.out.println("あなたは0～59点を取りましたね？");
                break;
            default:
                System.out.println("秀・優・良・可・不可のどれかを入力してください。");
                break;
        }
    }
}
