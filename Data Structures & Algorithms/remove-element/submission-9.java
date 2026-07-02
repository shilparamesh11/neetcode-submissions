class Solution {
    public int removeElement(int[] nums, int val) {
        int uniqueElementCount = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == val) {
                for (int j = nums.length - 1 ; j > i ; j --) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        uniqueElementCount ++;
                        break;
                    }
                }
            }
            else uniqueElementCount ++;
        }
        return uniqueElementCount;
    }
}