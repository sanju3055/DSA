/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2; // prevent overflow

            if (isBadVersion(mid)) {
                right = mid; // bad version found, check left side
            } else {
                left = mid + 1; // still good, go right
            }
        }
        return left;
    }
}