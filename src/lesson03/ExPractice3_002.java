package lesson03;

import java.util.Arrays;
import java.util.Collections;

public class ExPractice3_002 {
    public static void main(String[] args) {
        Integer[] nums = { 7, 11, 0, 76, 34 };
        //降順ソート
        Arrays.sort(nums, Collections.reverseOrder());

        //拡張for系
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
