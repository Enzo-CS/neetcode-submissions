class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> thisListKeepTracksofNumbersOk = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            if (thisListKeepTracksofNumbersOk.contains(nums[i])) {
                return true;
            }

            thisListKeepTracksofNumbersOk.add(nums[i]);
        }

        return false;
    }
}