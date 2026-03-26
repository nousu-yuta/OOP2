package lesson04;

public class Practice4_006 {
    public static void main(String[] args) {
        System.out.print("縦の数を入力してください：");
        int tate = new java.util.Scanner(System.in).nextInt();
        System.out.print("横の数を入力してください：");
        int yoko = new java.util.Scanner(System.in).nextInt();

        int[][] nums = new int[tate][yoko];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = count;
                if (count == 9) {
                    count = 0;
                } else {
                    count++;
                }
            }
        }

        for (int[] tnum : nums) {
            for (int num : tnum) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
