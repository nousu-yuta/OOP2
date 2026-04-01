package lesson06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice6_206 {
    public static void main(String[] args) {
        String[] array = { "1番", "2番", "4番" };
        array[2] = "3番";

        //要素数を固定している場合
        List<String> list = Arrays.asList(array);

        //要素数を任意にする
        List<String> list2 = new ArrayList<>(list);
        list2.add("4番");

        for (String element : list2) {
            System.out.println(element);
        }
    }
}
