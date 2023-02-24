package leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AuthenticationManager {

     private final int timeToLive;
     private final Map<String, Integer> tokens;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        this.tokens = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        tokens.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
       if (tokens.containsKey(tokenId) && tokens.get(tokenId) > currentTime) {
           tokens.put(tokenId, currentTime + timeToLive);
       }
    }

    public int countUnexpiredTokens(int currentTime) {
        AtomicInteger counter = new AtomicInteger();

        tokens.forEach((s, integer) -> {
            if (integer > currentTime){
                counter.getAndIncrement();
            }
        });
        return counter.get();
    }

    public static void main(String[] args) {
        AuthenticationManager authenticationManager = new AuthenticationManager(5);
        authenticationManager.generate("bob", 2);
        authenticationManager.renew("bob", 5);
        System.out.println(authenticationManager.countUnexpiredTokens(6));
    }
}
