package tyousenjou;

public class GameTest {
    public static void main(String[] args) {

        Character char1 = new Character("Leon", "戦士", 30, 10, 100, 50);
        Character char2 = new Character("Gail", "戦士", 15, 5, 100, 50);
        Character char3 = new Character("Soren", "魔法使い", 40, 30, 100, 50);
        Character char4 = new Character("Aria", "弓使い", 25, 10, 100, 50);
        Character char5 = new Character("Vale", "盗賊", 27, 15, 100, 50);

        char1.synergy(char2);
        char1.synergy(char3);
        char3.synergy(char4);
        char4.synergy(char5);
    }
}