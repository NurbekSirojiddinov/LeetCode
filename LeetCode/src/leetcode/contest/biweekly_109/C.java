package leetcode.contest.biweekly_109;

import java.util.*;

public class C {

    public String sortVowels(String s) {
        StringBuilder t = new StringBuilder();
        List<H> l = new ArrayList<>();
        Set<Character> c = new HashSet<>(Set.of('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'));

        for (int i = 0; i < s.length(); i++) {
            if(!c.contains(s.charAt(i))) {
                t.append(s.charAt(i));
            } else {
                t.append("*");
                l.add(new H(s.charAt(i), i));
            }
        }
        l.sort(Comparator.comparing(H::getC).thenComparing(H::getI));

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) != '*') {
                stringBuilder.append(t.charAt(i));
            } else {
                stringBuilder.append(l.get(0).getC());
                l.remove(0);
            }
        }
        return stringBuilder.toString();

    }
    public static void main(String[] args) {

    }
}
class H {
    char c;
    int i;

    public H(char c, int i) {
        this.c = c;
        this.i = i;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
