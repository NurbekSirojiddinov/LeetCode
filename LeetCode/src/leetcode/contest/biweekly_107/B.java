package leetcode.contest.biweekly_107;

public class B {
    public static int longestString(int x, int y, int z) {
        int sum = 0;
        int min = Math.min(Math.min(x, y), z);
        int flag = -1;

        while (true) {
            if (x != 0) {
                x -= min;
                sum += min;
                if (x == 0) {
                    flag = 0;
                }
            } else {
                sum += z + 1;
                break;
            }
            if (y != 0) {
                y -= min;
                sum += min;
                flag = 1;
            } else if (x != 0) {
                sum += z + 1;
            }
            if (z != 0) {
                if (x == 0 && y == 0) {
                    sum += z;
                    if (flag == 0) {
                        sum -= min - 1;
                    }
                    break;
                }
                sum += min;
                z -= min;
                if (z == 0 && x == 0) sum++;
                else if (z == 0 && y == 0) sum++;
                else if (z == 0) {
                    sum += Math.min(x,y) * 2;
                    break;
                }
            } else {
                if (x != 0 && y != 0)
                    sum += x + y;
                else sum += 1;
            }

            if (x == 0 && y == 0) break;
            if (x == 0 && z == 0) break;
            if (y == 0 && z == 0) break;

            if (x == 0) {
                min = Math.min(y, z);
            } else if (y == 0) {
                min = Math.min(x, z);
            } else {
                min = Math.min(x, y);
            }
        }
        return (sum) * 2;
    }

    public static void main(String[] args) {
        System.out.println(longestString(11, 11, 3));
    }
}
