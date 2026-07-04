class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        while(j >= i) {
            if (nums[i] == val) {
                if (nums[j] != val) {
                    nums[i ++] = nums[j --];
                } else {
                    j --;
                }
            } else {
                i ++;
            }
        }
        return i;
    }
}