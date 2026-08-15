class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[200];
        int i=0;
        int j=0;
        int maxLen=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            freq[ch]++;
        
        while(freq[ch]>1){
            freq[s.charAt(i)]--;
            i++;
        }
        maxLen=Math.max(maxLen,j-i+1);
        j++;
    }
        return maxLen;
    }
    
}