class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int len = s.length();
        int i = 0, j = 0, maxLen = 0;
        while(i < len && j < len) {
            if(!set.contains(s.charAt(j))) {
                maxLen = Math.max(j - i +1, maxLen);
                set.add(s.charAt(j));
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
}
