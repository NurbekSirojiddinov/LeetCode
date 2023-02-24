package leetcode.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RankTeamsByVotes {
    public static String rankTeams(String[] votes) {
        Map<Character, List<Integer>> voteCountsByPosition = new HashMap<>();
        List<Character> result = new ArrayList<>();
        int[] voteCounts;
        int length = votes[0].length() - 1;
        for (int i = 0; i <= length; i++) {
            voteCountsByPosition.put(votes[0].charAt(i), new ArrayList<>());
        }

        for (int i = 0; i <= length; i++) {
            voteCounts = new int[26];
            for (String vote : votes) {
                voteCounts[vote.charAt(i) - 'A']++;
            }
            for (int j = 0; j < 26; j++) {
                char c1 = (char) ('A' + j);
                if (voteCountsByPosition.containsKey(c1)) {
                    voteCountsByPosition.get(c1).add(voteCounts[j]);
                }
            }
        }

        for (Map.Entry<Character, List<Integer>> entry : voteCountsByPosition.entrySet()) {
            if (result.size() == 0) result.add(entry.getKey());
            else {
                List<Integer> list = entry.getValue();
                for (int j = 0; j < result.size(); j++) {
                    if (helper(voteCountsByPosition.get(result.get(j)), list) == 1) {
                        result.add(j, entry.getKey());
                        break;
                    }
                    if (j == result.size() - 1) {
                        result.add(entry.getKey());
                        break;
                    }
                }
            }
        }
        return String.join("", result.stream().map(Object::toString).toArray(String[]::new));
    }
    private static int helper(List<Integer> oldList, List<Integer> newList) {
        for (int i = 0; i < oldList.size(); i++) {
            int diff = oldList.get(i) - newList.get(i);
            if (diff != 0) {
                return diff > 0 ? 2 : 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(rankTeams(new String[]{"ABC", "ACB", "ABC", "ACB", "ACB"}));
    }
    /*

    {A=5982546844571166772856732,
    B=66484621328311477749833912,
    C=256482685987648544394785,
    D=4555765945447659683712254,
    E=45953552648536107545761175,
    F=11958446113453678434364946,
    G=87650851491081053575963445,
    I=9356267564665774465715183,
    J=57441129479832107356494707,
    K=58946441164381347852558512,
    L=1487767259425766126636756,
    M=694977869625439643225777,
    N=8410338831059106810636453113,
    O=36583654746333211587648128,
    P=455879465105106635831114345,
    Q=4776757754467545169466114,
    R=2786668674658345512445574,
    S=7756673565114684278435585,
    T=72148824668546103741075794,
    U=9774114764716682578345727,
    V=1052666739747432398695448,
    W=2577571155837785543685653,
    X=7347466244597776387512347,
    Z=8235759874442441166775955}

     */
}
