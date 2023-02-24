package leetcode.hashMap;

import java.util.Arrays;

public class DividePlayersIntoTeamsOfEqualSkill {
    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        long sumOfChemistry;
        int low = 1;
        int high = skill.length - 2;
        int chemistry = skill[0] + skill[skill.length - 1];
        sumOfChemistry = (long) skill[0] * skill[skill.length - 1];

        while (low < high) {
            if (skill[low] + skill[high] != chemistry) {
                return -1;
            }
            sumOfChemistry += (long) skill[low] * skill[high];
            low++;
            high--;
        }
        return sumOfChemistry;
    }

    public static void main(String[] args) {
        System.out.println(dividePlayers(new int[]{3, 2, 5, 1, 3, 4}));
    }
}
