class Solution {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;
        
        // If either endpoint is odd, add 1
        if (low % 2 != 0 || high % 2 != 0) {
            count++;
        }
        
        return count;
    }
}