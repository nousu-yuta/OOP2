package lesson04;

import java.util.ArrayList;
import java.util.List;

public class Practice4_001 {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 8, 10, 42 };
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + 1 + "つ目の要素：" + nums[i]);
        }

        List<Integer> list = new ArrayList<>();
        copyList(list, nums);

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "つ目の要素：" + list.get(i));
        }
    }

    static void copyList(List<Integer> list, int[] nums) {
        for (int num : nums) {
            list.add(num);
        }
    }
}
