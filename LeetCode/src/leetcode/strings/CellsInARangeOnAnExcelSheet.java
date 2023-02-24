package leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public static List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        int r1 = s.charAt(0);
        int c1 = Integer.parseInt(String.valueOf(s.charAt(1)));
        int r2 = s.charAt(3);
        int c2 = Integer.parseInt(String.valueOf(s.charAt(4)));
        StringBuilder temp = new StringBuilder();

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                temp.append((char) i);
                temp.append(j);
                ans.add(temp.toString());
                temp = new StringBuilder();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(cellsInRange("K1:L2"));
    }
}
