1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3        List<Integer> res = new ArrayList<>();
4        int wordLen = words[0].length();
5        int wordCount = words.length;
6        int totalLen = wordLen * wordCount;
7
8        HashMap<String,Integer> requiredMap = new HashMap<>();
9        for(String word : words){
10            requiredMap.put(word,requiredMap.getOrDefault(word,0)+1);
11        }
12
13        for(int i = 0 ; i < wordLen;i++){
14            int low = i;
15            int count= 0;
16            HashMap<String,Integer> windowMap = new HashMap<>();
17            for(int high = i ; high + wordLen <= s.length() ;high += wordLen){
18                String word = s.substring(high,high+wordLen);
19
20                if(!requiredMap.containsKey(word)){
21                    windowMap.clear();
22                    count = 0;
23                    low = high + wordLen;
24                    continue;
25                }
26                windowMap.put(word,windowMap.getOrDefault(word,0)+1);
27                count++;
28
29                while(requiredMap.get(word) < windowMap.get(word)){
30                    String leftWord = s.substring(low,low+wordLen);
31                    windowMap.put(leftWord,windowMap.getOrDefault(leftWord,0)-1);
32                    low += wordLen;
33                    count--;
34                }
35
36                if(count == wordCount){
37                    res.add(low);
38                    String leftWord = s.substring(low,low+wordLen);
39                    windowMap.put(leftWord,windowMap.getOrDefault(leftWord,0)-1);
40                    low += wordLen;
41                    count--;
42                }
43            }
44        }
45        return res;
46}
47}