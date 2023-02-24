package leetcode.arrays;

import java.util.*;

public class RevealCardsInIncreasingOrder {
    public static int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.sort(deck);

        deque.push(deck[deck.length - 1]);
        for (int i = deck.length - 2; i >= 0; i--) {
            deque.push(deque.pollLast());
            deque.push(deck[i]);
        }
        for (int i = 0; i < deck.length; i++) {
                deck[i] = deque.pop();
        }
        return deck;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deckRevealedIncreasing(new int[]{1, 2, 3, 4, 5, 6})));
    }
}
