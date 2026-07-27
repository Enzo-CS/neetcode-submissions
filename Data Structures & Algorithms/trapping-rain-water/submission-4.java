class Solution {
    public int trap(int[] height) {
        int left  = 0;
        int right = height.length - 1;
        int maxLeft  = height[left];
        int maxRight = height[right];
        int trapped = 0;

        while (left <= right) {
            int leftVal  = height[left];
            int rightVal = height[right];

            if (maxLeft < maxRight) {
                System.out.printf("L%d / %d - %d\n", trapped, leftVal, maxLeft);
                int area = Math.min(maxLeft, maxRight) - leftVal;
                trapped += (area > 0) ? area : 0;
                maxLeft = Math.max(maxLeft, leftVal);
                left++;
            } else { 
                System.out.printf("R%d / %d - %d\n", trapped, rightVal, maxRight);
                int area = Math.min(maxLeft, maxRight) - rightVal;
                trapped += (area > 0) ? area : 0;
                maxRight = Math.max(maxRight, rightVal);
                right--;
            }
        }

        return trapped;
    }
}
