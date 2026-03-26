package lesson04;

public class Practice4_005 {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 15, 60 };
        System.out.println("配列を解放します");
        nums = null;
        if (nums == null) {
            System.out.println("numsは空です");
        }
    }
}
