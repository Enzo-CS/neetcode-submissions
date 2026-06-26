class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length = nums.length;

        for (int i=0; i<length; i++) {
            int cur = nums[i];
            for (int j=i+1; j<length; j++) {
                if (cur == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}