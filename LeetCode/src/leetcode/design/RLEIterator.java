package leetcode.design;

public class RLEIterator {

    int[] encoding;
    int index = 0;

    public RLEIterator(int[] encoding) {
        this.encoding = encoding;
    }

    public int next(int n) {
        for (int i = index; i < encoding.length; i += 2) {
            if (n >= encoding[i]) {
                n = n - encoding[i];
                if (n == 0) {
                    index = i + 2;
                    return encoding[i + 1];
                }
            } else {
                encoding[i] = encoding[i] - n;
                index = i;
                return encoding[i + 1];
            }
        }
        index = encoding.length;
        return -1;
    }

    public static void main(String[] args) {
        RLEIterator iterator = new RLEIterator(new int[]{635,606,576,391,370,981,36,21,961,185,124,210,801,937,22,426});
        System.out.println(iterator.next(5039));
        System.out.println(iterator.next(62));
        System.out.println(iterator.next(40));
        System.out.println(iterator.next(2));
    }
}
