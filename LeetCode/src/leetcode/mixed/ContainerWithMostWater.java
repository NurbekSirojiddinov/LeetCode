package leetcode.mixed;

public class ContainerWithMostWater {
    public static void main(String[] args) {
int[] height = {1,8,100,2,100,4,8,3,7};
        System.out.println(maxArea(height));
    }
    private static int maxArea(int[] height) {

        int i = 0;
        int a = 0;
        int j = height.length-1;
        int b = 0;
        int m = i;
        int n = j;
        int maxArea = 0;

        while(i < j) {
            if(height[i] > a) {
                maxArea = Math.max(maxArea, (Math.min(a, height[i]) * (i-m)));
                a = height[i];
                m = i;
            }if(height[j] > b) {
                maxArea = Math.max(maxArea, (Math.min(height[j], b) * (n-j)));
                b = height[j];
                n = j;
            } maxArea = Math.max(maxArea, (Math.min(a, b) * (n-m)));
            i++;
            maxArea = Math.max(maxArea, (Math.min(height[i], a) * (i-m)));
            maxArea = Math.max(maxArea, (Math.min(height[i], height[j]) * (j-i)));
            j--;
            maxArea = Math.max(maxArea, (Math.min(height[j], b) * (n-j)));
            maxArea = Math.max(maxArea, (Math.min(height[i], height[j]) * (j-i)));
        }
        return maxArea;
    }
}
