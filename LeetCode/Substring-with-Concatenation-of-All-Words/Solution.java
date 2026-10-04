1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3
4        List<Integer> res = new ArrayList<>();
5
6        int wordLen = words[0].length();
7        int wordCount = words.length;
8        int totalLen = wordLen * wordCount;
9
10        if (s.length() < totalLen) {
11            return res;
12        }
13
14        HashMap<String, Integer> required = new HashMap<>();
15
16        for (String word : words) {
17            required.put(word, required.getOrDefault(word, 0) + 1);
18        }
19
20        // We need to try every possible starting offset
21        for (int offset = 0; offset < wordLen; offset++) {
22
23            int low = offset;
24            int count = 0;
25
26            HashMap<String, Integer> window = new HashMap<>();
27
28            for (int high = offset; high + wordLen <= s.length(); high += wordLen) {
29
30                String word = s.substring(high, high + wordLen);
31
32                // Word is not present in words
33                if (!required.containsKey(word)) {
34                    window.clear();
35                    count = 0;
36                    low = high + wordLen;
37                    continue;
38                }
39
40                window.put(word, window.getOrDefault(word, 0) + 1);
41                count++;
42
43                // Too many occurrences of this word
44                while (window.get(word) > required.get(word)) {
45
46                    String leftWord = s.substring(low, low + wordLen);
47
48                    window.put(leftWord, window.get(leftWord) - 1);
49
50                    low += wordLen;
51                    count--;
52                }
53
54                // Found exactly wordCount words
55                if (count == wordCount) {
56                    res.add(low);
57
58                    String leftWord = s.substring(low, low + wordLen);
59
60                    window.put(leftWord, window.get(leftWord) - 1);
61
62                    low += wordLen;
63                    count--;
64                }
65            }
66        }
67
68        return res;
69    }
70}