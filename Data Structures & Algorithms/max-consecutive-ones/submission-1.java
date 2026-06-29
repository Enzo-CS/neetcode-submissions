class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curMax = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                curMax++;
            } else {
                curMax = 0;
            }
            
            if (curMax > max) {
                    max = curMax;
                }
        }

        return max;
        
    }

    // 1 1 0 1 1 1 

}