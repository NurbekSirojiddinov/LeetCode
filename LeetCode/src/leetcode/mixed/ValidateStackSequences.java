package leetcode.mixed;

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {2,3,0,1};
        int[] popped = {0,3,2,1};
        System.out.println(validateStackSequences(pushed, popped));
    }
    private static boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        int j = 0;
        Stack<Integer> stack = new Stack<>();

        while(i != pushed.length) {
            if(pushed[i] != popped[j]) {
                stack.push(pushed[i]);
            } else {
                j++;
                while(!stack.isEmpty() && stack.peek() == popped[j]){
                    stack.pop();
                    j++;
                }
            }
            i++;
        }
        return stack.isEmpty();
    }
}
