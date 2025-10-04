class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        int start = nums[0];  // start of current range
        int end = nums[0];    // end of current range

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                // consecutive number, extend the range
                end = nums[i];
            } else {
                // range ended, add to result
                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end);
                }
                // start a new range
                start = end = nums[i];
            }
        }

        // add the last range
        if (start == end) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + end);
        }

        return result;
    }
}