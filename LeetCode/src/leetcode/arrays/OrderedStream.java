package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    String[] orderedStream;
    int chunk = 0;

    public OrderedStream(int n) {
        orderedStream = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        orderedStream[idKey - 1] = value;
        if(chunk == idKey - 1)chunk++;
        while (chunk < orderedStream.length && orderedStream[chunk] != null) {
            chunk++;
        }
        while (idKey - 1 < orderedStream.length && chunk > idKey - 1) {
            list.add(orderedStream[idKey - 1]);
            idKey++;
        }
        return list;
    }

    public static void main(String[] args) {
        OrderedStream stream = new OrderedStream(5);
        System.out.println(stream.insert(3, "ccccc"));
        System.out.println(stream.insert(1, "aaaaa"));
        System.out.println(stream.insert(2, "bbbbb"));
        System.out.println(stream.insert(5, "eeeee"));
        System.out.println(stream.insert(4, "ddddd"));
    }
}
