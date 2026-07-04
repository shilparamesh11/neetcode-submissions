class Solution {
    public int removeElement(int[] nums, int val) {
        int uniqueElementCount = 0, i = 0, j = nums.length - 1;
        while(i < nums.length) {
            if (nums[i] == val) {
                while (j > i) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        uniqueElementCount ++;
                        break;
                    } else j --;
                }
            }
            else uniqueElementCount ++;
            i ++;
        }
        return uniqueElementCount;
    }
}