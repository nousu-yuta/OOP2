package lesson03;

public class Practice3_009 {
    public static void main(String[] args) {
        System.out.println("3の倍数でスキップします");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("終わります");
    }

}
