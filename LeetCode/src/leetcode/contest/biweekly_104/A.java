package leetcode.contest.biweekly_104;

public class A {
    public int countSeniors(String[] details) {
        int counter = 0;

        for (String str : details) {
            if (Integer.parseInt(str.substring(11, 13)) > 60) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.countSeniors(new String[]{"dandm"}));
    }
}
