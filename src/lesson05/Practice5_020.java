package lesson05;

public class Practice5_020 {
    public static void main(String[] args) {
        String[] strs = { "りんご", "ごりら", "らっぱ" };

        System.out.println("しりとりをします。");
        for (String siri : strs) {
            System.out.println(siri);
        }
        System.out.println(strs[strs.length - 1].indexOf("ン", strs[strs.length - 1].length() - 1) > -1 ? "負けていますね。"
                : "まだまだ続きそうです。");
    }
}
