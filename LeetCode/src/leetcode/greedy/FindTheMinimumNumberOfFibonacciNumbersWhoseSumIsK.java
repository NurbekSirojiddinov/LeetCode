package leetcode.greedy;

public class FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK {
    public static int findMinFibonacciNumbers(int k) {
        if(k <= 2) return 1;

        int counter = 0;
        int j = 2;
        int first = 1;
        int second = 1;
        int curr;

        while(second < k) {
            curr = first + second;
            first = second;
            second = curr;
            j++;
        }
        int[] arr = new int[j];
        arr[0] = 1;
        arr[1] = 1;
        int i = 2;

        for(int l = i; l < j; l++) {
            arr[l] = arr[l-1]+arr[l-2];
        }
        j--;

        while(k != 0) {
            if(k - arr[j] >= 0) {
                k -= arr[j];
                counter++;
            }
            j--;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(findMinFibonacciNumbers(2));
    }
}
