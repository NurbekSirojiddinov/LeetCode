package Alorithm_Univercity.paradigm.amaliy5;

public class Chars {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'A', 'B', 'e', 'O', 'P', 'o', 'Q'};
        int letter1 = 0;
        int letter2 = 0;

        for (char aChar : chars) {
            if (aChar <= 90) {
                letter1++;
            } else {
                letter2++;
            }
        }
        System.out.println("katta xarflar soni: " + letter1);
        System.out.println("kichik xarflar soni: " + letter2);
    }
}
