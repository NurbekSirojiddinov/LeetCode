package leetcode.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class RearrangeWordsInASentence {
    public static String arrangeWords(String text) {

        String[] words = text.split(" ");
        MyCustomClass[] myCustomClasses = new MyCustomClass[words.length];

        words[0] = words[0].substring(0, 1).toLowerCase() + words[0].substring(1);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            myCustomClasses[i] = new MyCustomClass(i, words[i]);
        }
        Arrays.sort(myCustomClasses, Comparator.comparing(MyCustomClass::getLength).thenComparing(MyCustomClass::getIndex));

        for (MyCustomClass customClass : myCustomClasses) {
            stringBuilder.append(customClass.getWord()).append(" ");
        }

        return stringBuilder.substring(0, 1).toUpperCase() + stringBuilder.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(arrangeWords("Keep calm and code on"));
    }
}

class MyCustomClass {
    private int index;
    private String word;

    public MyCustomClass(int index, String word) {
        this.index = index;
        this.word = word;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getWord() {
        return word;
    }

    public int getLength() {
        return word.length();
    }

    public void setWord(String word) {
        this.word = word;
    }
}

