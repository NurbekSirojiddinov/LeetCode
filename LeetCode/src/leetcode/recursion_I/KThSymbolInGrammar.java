package leetcode.recursion_I;

public class KThSymbolInGrammar {
    public static int kthGrammar(int n, int k) {
        if (n == 1 && k == 1)
            return 0;

        int prevK = (k + 1) / 2; // Get the corresponding position in the previous row
        int prevSymbol = kthGrammar(n - 1, prevK);
        if (prevSymbol == 0) {
            return (k % 2 == 0) ? 1 : 0;
        } else {
            return (k % 2 == 0) ? 0 : 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(5, 3));
    }
}
