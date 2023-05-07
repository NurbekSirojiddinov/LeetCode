package leetcode.daily;

public class Dota2Senate {
    public static String predictPartyVictory(String senate) {
        StringBuilder str = new StringBuilder(senate);
        int R = 0;
        int D = 0;
        int index = 0;

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') R++;
            else D++;
        }

        while (R != 0 && D != 0) {
            char c = str.charAt(index);

            if (c == 'R') {
                str.deleteCharAt(str.indexOf("D"));
                D--;
            }
        }

        return D == 0 ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("D D D R R D R D R D R D R D R D"));
    }
}
