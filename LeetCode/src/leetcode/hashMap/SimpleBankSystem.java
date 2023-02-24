package leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

public class SimpleBankSystem {
    Map<String, Long> balance = new HashMap<>();

    public SimpleBankSystem(long[] balance) {
        for (int i = 0; i < balance.length; i++) {
            this.balance.put(String.valueOf(i + 1), balance[i]);
        }
    }

    public boolean transfer(int account1, int account2, long money) {
        if (!balance.containsKey(String.valueOf(account1)) || !balance.containsKey(String.valueOf(account2)) || balance.get(String.valueOf(account1)) < money) {
            return false;
        }
        balance.put(String.valueOf(account1), balance.get(String.valueOf(account1)) - money);
        balance.put(String.valueOf(account2), balance.get(String.valueOf(account2)) + money);
        return true;
    }

    public boolean deposit(int account, long money) {
        if (!balance.containsKey(String.valueOf(account))) {
            return false;
        }
        balance.put(String.valueOf(account), balance.get(String.valueOf(account)) + money);
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (!balance.containsKey(String.valueOf(account)) || balance.get(String.valueOf(account)) < money) {
            return false;
        }
        balance.put(String.valueOf(account), balance.get(String.valueOf(account)) - money);
        return true;
    }

    public static void main(String[] args) {

    }
}
