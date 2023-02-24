package leetcode.Arrays;

import java.awt.image.Kernel;
import java.util.*;

class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {0,0,0}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Map<String, Integer> map = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();
        int index1 = 0;
        int index2 = 1;
        int index3 = nums.length-1;
        Arrays.sort(nums);
        

        while(index2 != index3 && index1 < nums.length && nums[index1] <= 0) {
            if(nums[index1] + nums[index2] + nums[index3] == 0) {
                String str = String.valueOf(nums[index1]) +
                        nums[index2] +
                        nums[index3];
                if (!map.containsKey(str)) {
                    answer.add(Arrays.asList(nums[index1], nums[index2], nums[index3]));
                }
                map.put(str, 1);
                index2++;
            } else if(nums[index1] + nums[index2] + nums[index3] < 0) {
                index2++;
            } else {
                index3--;
            } if(index2 == index3) {
                index1++;
                index2 = index1+1;
                index3 = nums.length-1;
            }
        }
        return answer;

    }
}
//-4, -1, -1, 0, 1, 2