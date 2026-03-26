package lesson04;

import java.util.HashMap;
import java.util.Map;

public class ExPractice4_004 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "java太郎");
        map.put("hobby", "java");
        map.put("class", "アーチャー");

        //Enterきーto
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
