class Solution {
    public int findComplement(int num) {
        int mask = Integer.highestOneBit(num);
        
        // Create mask with all bits set to 1 up to that point
        mask = (mask << 1) - 1;
        
        // XOR flips the bits within that mask
        return num ^ mask;
    }
}