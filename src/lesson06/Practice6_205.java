package lesson06;

import java.util.ArrayList;
import java.util.List;

public class Practice6_205 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("ね");
        list.add("よ");
        list.add("う！");

        for (String element : list) {
            System.out.println(element);
        }
    }

}
