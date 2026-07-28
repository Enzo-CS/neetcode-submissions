class Solution {
    public int trap(int[] height) {
        int left  = 0;
        int right = height.length - 1;

        int maxLeft  = height[left];
        int maxRight = height[right];

        int maxArea = 0;

        while (left <= right) {
            int leftVal  = height[left];
            int rightVal = height[right];

            if (maxLeft < maxRight) {
                left++;
                int area = Math.min(maxLeft, maxRight) - leftVal;
                maxArea += Math.max(area, 0);
                maxLeft = Math.max(maxLeft, leftVal);
            } else {
                right--;
                int area = Math.min(maxLeft, maxRight) - rightVal;
                maxArea += Math.max(area, 0);
                maxRight = Math.max(maxRight, rightVal);
            }
        }

        return maxArea;
    }
}
