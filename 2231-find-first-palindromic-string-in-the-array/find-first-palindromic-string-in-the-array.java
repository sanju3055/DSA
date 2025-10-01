class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String str=words[i];
            boolean isPalindrome=true;
            for(int j=0;j<str.length()/2;j++){
                if(str.charAt(j)!=str.charAt(str.length()-1-j)){
                    isPalindrome=false;
                    break;
                }
            }
            if(isPalindrome){
                return str;
            }
        }
        return "";
    }
}