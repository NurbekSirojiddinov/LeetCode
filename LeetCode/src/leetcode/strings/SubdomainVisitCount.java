package leetcode.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {
    public static List<String> subdomainVisits(String[] domains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String domain : domains) {
            int rep = Integer.parseInt(domain.substring(0, domain.indexOf(' ')));
            String domain1 = domain.substring(domain.indexOf(' ') + 1);
            String domain2 = domain.substring(domain.indexOf(".") + 1);
            if (domain.indexOf(".") != domain.lastIndexOf(".")) {
                String domain3 = domain.substring(domain.lastIndexOf('.') + 1);
                map.put(domain3, map.getOrDefault(domain3, 0) + rep);
            }
            map.put(domain1, map.getOrDefault(domain1, 0) + rep);
            map.put(domain2, map.getOrDefault(domain2, 0) + rep);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue().toString() + " " + entry.getKey());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }
}
