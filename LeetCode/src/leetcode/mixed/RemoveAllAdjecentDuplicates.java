package leetcode.mixed;

public class RemoveAllAdjecentDuplicates {
    public static void main(String[] args) {

        String s = "yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy";
        int k = 4;
        System.out.println(removeDuplicates(s, k));
    }

    private static String removeDuplicates(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder(s);

        while (true) {
            int a = 0;
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (i >= 0 && i + k - 1 < stringBuilder.length() && stringBuilder.charAt(i) == stringBuilder.charAt(i + k - 1)) {
                    stringBuilder.delete(i, i + k);
                    i -= k;
                    a++;
                }
            }
            if (a == 0) break;
        }
        return stringBuilder.toString();
    }
}
