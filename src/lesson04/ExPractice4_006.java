package lesson04;

public class ExPractice4_006 {
    public static void main(String[] args) {
        String[][][] members = new String[4][][];

        int count = 1;
        for (int i = 0; i < members.length; i++) {
            if (i + 1 == 4) {
                members[i] = new String[1][];
            } else {
                members[i] = new String[2][];
            }
            for (int j = 0; j < members[i].length; j++) {
                members[i][j] = new String[2];
                for (int k = 0; k < members[i][j].length; k++) {
                    members[i][j][k] = count + "郎";
                    count++;
                }
            }
        }
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < members[i].length; i++) {
                System.out.println("R" + (i + 1) + "A" + (j + 1) + "のメンバーを紹介します");
                for (String member3 : members[i][j]) {
                    System.out.println(member3);
                }
            }
        }
    }
}
