package main;

public class FindLongestSpecialSubstringThatOccursThriceii {
    import java.util.HashMap;
import java.util.Map;

    class Solution {

        public int maximumLength(String s) {

            Map<Character, Long> mp = new HashMap<>();


            Map<String, Integer> mpp = new HashMap<>();


            int cnt = 0;


            char c = s.charAt(0);


            int j = 0;


            int n = s.length();

            String ns, ns1, ns2, ns3;

            for (int i = 0; i < n; i++) {

                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0L) + 1);
                if (s.charAt(i) == c) {
                    cnt++;
                } else {
                    ns = s.substring(j, i);
                    mpp.put(ns, mpp.getOrDefault(ns, 0) + 1);
                    if (ns.length() >= 3) {
                        ns1 = s.substring(j, i - 1);
                        mpp.put(ns1, mpp.getOrDefault(ns1, 0) + 2);
                        ns2 = s.substring(j, i - 2);
                        mpp.put(ns2, mpp.getOrDefault(ns2, 0) + 3);
                    }
                    cnt = 1;
                    j = i;
                    c = s.charAt(i);
                }
            }
            ns = s.substring(j, n);
            if (ns.length() >= 3) {
                ns1 = s.substring(j, n - 1);
                mpp.put(ns1, mpp.getOrDefault(ns1, 0) + 2);
                ns2 = s.substring(j, n - 2);
                mpp.put(ns2, mpp.getOrDefault(ns2, 0) + 3);
            }
            mpp.put(s.substring(j, n), mpp.getOrDefault(s.substring(j, n), 0) + 1);
            int ans = 0;
            int nns;
            int v;
            for (Map.Entry<String, Integer> entry : mpp.entrySet()) {
                nns = entry.getKey().length();
                v = entry.getValue();
                if (v >= 3) {
                    ans = Math.max(ans, nns);
                }
            }
            if (ans == 0) {
                for (Map.Entry<Character, Long> entry : mp.entrySet()) {
                    if (entry.getValue() >= 3) {
                        ans = 1;
                        return ans;
                    }
                }
            }
            return (ans == 0) ? -1:ans;
        }
    }

}
