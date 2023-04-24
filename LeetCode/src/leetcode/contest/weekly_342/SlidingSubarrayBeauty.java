//package leetcode.contest.weekly_342;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class SlidingSubarrayBeauty {
//    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
//        int n = nums.length;
//        int index = 0;
//        int firstMin = 0;
//        int secondMin = 0;
//        int j = 0;
//        int[] beauties = new int[n - k + 1];
//        Subarray[] arr = new Subarray[k];
//
//        for (int i = 0; i < k; i++) {
//            arr[i] = new Subarray(i, nums[i]);
//        }
//        Arrays.sort(arr, Comparator.comparing(Subarray::getVal));
//        int m = 0;
//        for (Subarray subarray : arr) {
//            if (subarray.val >= 0) {
//                break;
//            }
//            m++;
//        }
//        if (m - x > 0) {
//            firstMin = m-x;
//            j =  arr[m-x].val;
//            beauties[index++] = arr[m-x].val;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < 0) {
//                if (nums[index] < 0) {
//
//                }
//            }
//        } else {
//
//            }
//
//    }
//}
////1,-1,-3,-2,3
////
//
//class Subarray {
//    int index;
//    int val;
//
//    public Subarray(int index, int val) {
//        this.index = index;
//        this.val = val;
//    }
//
//    public int getIndex() {
//        return index;
//    }
//
//    public void setIndex(int index) {
//        this.index = index;
//    }
//
//    public int getVal() {
//        return val;
//    }
//
//    public void setVal(int val) {
//        this.val = val;
//    }
//}
