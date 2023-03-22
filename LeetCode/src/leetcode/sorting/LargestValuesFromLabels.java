package leetcode.sorting;

import java.util.*;

public class LargestValuesFromLabels {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {

        CustomValueAndLabelClass[] valLabel = new CustomValueAndLabelClass[values.length];
        int maxSum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < values.length; i++) {
            valLabel[i] = new CustomValueAndLabelClass(values[i], labels[i]);
        }

        Arrays.sort(valLabel, Comparator.comparing(CustomValueAndLabelClass::getVal));

        for (int i = valLabel.length - 1; i >= 0; i--) {
            int label = valLabel[i].getLabel();
            if (!map.containsKey(label) || map.get(label) > 0) {
                map.put(label, map.getOrDefault(label, useLimit) - 1);
                maxSum += valLabel[i].getVal();

                numWanted--;
                if (numWanted == 0) break;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        LargestValuesFromLabels object = new LargestValuesFromLabels();
        System.out.println(object.largestValsFromLabels(new int[]{5, 4, 3, 2, 1}, new int[]{1, 1, 2, 2, 3}, 3, 1));
    }
}

class CustomValueAndLabelClass {
    int val;
    int label;

    public CustomValueAndLabelClass(int val, int label) {
        this.val = val;
        this.label = label;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }
}
