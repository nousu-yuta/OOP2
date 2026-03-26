package lesson05;

public class Practice5_012 {
    public static void main(String[] args) {

        String str = "AAABBCDDDDDDEEFGHHHHH";
        String rleStr = makeRLE(str);

        System.out.println("[" + str + "]を圧縮します");
        System.out.println("[" + rleStr + "]です。");
    }

    public static String makeRLE(String str) {
        String result = "";
        String cul = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            cul = str.substring(i, i + 1);

            if (str.length() > i + 1 && cul.equals(str.substring(i + 1, i + 2))) {
                count++;
            } else {
                result += cul;
                if (count > 0) {
                    result += count;
                }
                count = 0;
            }
        }

        return result;
    }
}
