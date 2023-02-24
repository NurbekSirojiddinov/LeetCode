package leetcode.hashMap;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public static boolean isPathCrossing(String path) {
        int xAxis = 0;
        int yAxis = 0;

        Set<String> coordinates = new HashSet<>();
        coordinates.add("0,0");

        StringBuilder coordBuilder = new StringBuilder();

        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);

            if (c == 'N') {
                yAxis++;
            } else if (c == 'S') {
                yAxis--;
            } else if (c == 'E') {
                xAxis++;
            } else {
                xAxis--;
            }
            coordBuilder.setLength(0);
            coordBuilder.append(xAxis).append(",").append(yAxis);
            String coordString = coordBuilder.toString();
            if (coordinates.contains(coordString)) {
                return true;
            } else {
                coordinates.add(coordString);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPathCrossing("ENNNNNNNNNNNEEEEEEEEEESSSSSSSSSS"));
    }
}
