package leetcode.contest;

public class CategorizeBoxAccordingToCriteria {
    public static String categorizeBox(int length, int width, int height, int mass) {
        String bulky = "";
        String heavy = "";
        long result = (long) height * width * length;


        if (length >= 10000 || width >= 10000 || height >= 10000 || mass >= 10000 || result >= 1000000000) {
            bulky = "Bulky";
        }

        if (mass >= 100) {
            heavy = "Heavy";
        }
        if (bulky.equals("Bulky") && heavy.equals("Heavy")) {
            return "Both";
        }
        if (!bulky.equals("Bulky") && !heavy.equals("Heavy")) {
            return "Neither";
        }

        if (!heavy.equals("Heavy") && bulky.equals("Bulky")) {
            return "Bulky";
        }
        if (heavy.equals("Heavy") && !bulky.equals("Bulky")) {
            return "Bulky";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(categorizeBox(2909, 3968, 3272, 727));
    }
}
