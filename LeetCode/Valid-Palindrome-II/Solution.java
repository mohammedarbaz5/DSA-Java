1class Solution {
2    public boolean validPalindrome(String s) {
3        int left = 0;
4        int right = s.length()-1;
5        while(left < right){
6            if(s.charAt(left) != s.charAt(right)){
7                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
8            }
9            left++;
10            right--;
11        }
12        return true; 
13    }
14
15    public boolean isPalindrome(String s,int l,int r){
16        while(l < r){
17            if(s.charAt(l) != s.charAt(r)){
18                return false;
19            }
20            l++;
21            r--;
22        }
23        return true; 
24    }
25}