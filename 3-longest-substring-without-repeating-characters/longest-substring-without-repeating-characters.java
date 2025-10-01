class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int length=0;
        int maxlength=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                length=Math.max(length,map.get(ch)+1);
            }
            map.put(ch,i);
            maxlength=Math.max(maxlength,i-length+1);
        }
        return maxlength;
    }
}