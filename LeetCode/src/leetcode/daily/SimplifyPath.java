package leetcode.daily;

import java.util.Arrays;
import java.util.Objects;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        String[] directories = path.split("/");
        StringBuilder canonicalPath = new StringBuilder();
        int count = 0;

        for (int i = directories.length - 1; i >= 0; i--) {
            if (Objects.equals(directories[i], "")) {
                continue;
            }
            if (directories[i].equals(".")) {
                directories[i] = "";
            } else if (directories[i].equals("..")) {
                directories[i] = "";
                count++;
            } else if (count > 0) {
                directories[i] = "";
                count--;
            }
        }

        for (String str : directories) {
            if (!str.equals("")) {
                canonicalPath.append("/").append(str);
            }
        }
        if (canonicalPath.isEmpty()) {
            canonicalPath.append("/");
        }
        return canonicalPath.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/../.."));
    }
}
