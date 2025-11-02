class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;        // shift left to make space
            result |= (n & 1);   // add the last bit of n
            n >>= 1;             // shift n to process next bit
        }
        return result;
    }
}