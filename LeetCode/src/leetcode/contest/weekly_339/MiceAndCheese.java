package leetcode.contest.weekly_339;

import java.util.*;

public class MiceAndCheese {
    public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        CheeseAndIndex[] cheeseAndIndices = new CheeseAndIndex[reward1.length];
        int count = 0;
        int sum = 0;
        int reward;
        int index;

        for (int i = 0; i < reward1.length; i++) {
            cheeseAndIndices[i] = new CheeseAndIndex(i, reward1[i]);
        }

        Arrays.sort(cheeseAndIndices, Comparator.comparing(CheeseAndIndex::reward).reversed());

        for (int i = 0; i < cheeseAndIndices.length; i++) {
            reward = cheeseAndIndices[i].reward();
            index = cheeseAndIndices[i].index();

            if (i + 1 < cheeseAndIndices.length && reward == cheeseAndIndices[i + 1].reward()) {
                List<CheeseAndIndex> list = new ArrayList<>();
                int j;
                while (i + 1 < cheeseAndIndices.length && reward == cheeseAndIndices[i + 1].reward()) {
                    j = cheeseAndIndices[i].index();
                    list.add(new CheeseAndIndex(j, reward2[j]));
                    i++;
                }
                j = cheeseAndIndices[i].index();
                list.add(new CheeseAndIndex(j, reward2[j]));
                list.sort(Comparator.comparing(CheeseAndIndex::reward));
                j = 0;
                while (k > 0 && j < list.size()) {
                    k--;
                    sum+=reward;
                    reward2[list.get(j).index()] = 0;
                    j++;
                }
                if (k == 0) break;
            }
            else if (k > 0 && (reward > reward2[index] || cheeseAndIndices.length - i == k)) {
                k--;
                sum += reward;
                reward2[index] = 0;
            }
        }
        sum += Arrays.stream(reward2).sum();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(miceAndCheese(new int[]{1,3}, new int[]{5,4}, 1));

    }
}

record CheeseAndIndex(int index, int reward) {
}
