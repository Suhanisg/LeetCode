package main;

public class FindCommonCharacters {
    class Solution {
        public List<String> commonChars(String[] words) {
            List<String> l1 = new ArrayList<>();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                int minCount = Integer.MAX_VALUE;
                for (String word : words) {
                    int count = 0;
                    for (char c : word.toCharArray()) {
                        if (c == ch) {
                            count++;
                        }
                    }
                    minCount = Math.min(minCount, count);
                }
                for (int i = 0; i < minCount; i++) {
                    String s = String.valueOf(ch);
                    l1.add((s));
                }
            }

            return l1;
        }
    }

}
