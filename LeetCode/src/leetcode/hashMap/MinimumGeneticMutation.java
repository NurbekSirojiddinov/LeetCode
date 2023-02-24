package leetcode.hashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumGeneticMutation {
    public static int minMutation(String startGene, String endGene, String[] bank) {

        Set<String> setOfBank = new HashSet<>(Arrays.asList(bank));
        int mutations = 0;

        for (int i = 0; i < endGene.length(); i++) {
            if (endGene.charAt(i) != startGene.charAt(i)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(startGene, 0, i);
                stringBuilder.append(endGene.charAt(i));
                stringBuilder.append(startGene, i + 1, startGene.length());
                if (!setOfBank.contains(stringBuilder.toString()) && i == endGene.length() - 1) {
                    return -1;
                } else if (setOfBank.contains(stringBuilder.toString())) {
                    i = -1;
                    mutations++;
                    startGene = stringBuilder.toString();
                }
            }
        }
        return mutations;
    }

    public static void main(String[] args) {
        System.out.println(minMutation("AACCGGTT", "AAACGGTA", new String[]{"AACCGATT", "AACCGATA", "AAACGATA", "AAACGGTA"}));
    }
}
