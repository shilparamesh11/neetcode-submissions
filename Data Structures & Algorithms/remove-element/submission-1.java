class Solution {
    public int removeElement(int[] nums, int val) {
        for (int i = 0 ; i < nums.length ; i++) {
            int shiftIndex = i;
            while (shiftIndex < nums.length && nums[shiftIndex] == val) shiftIndex++;
            shiftLeft(nums, i, shiftIndex-i);
        }

        int uniqueElementCount = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] != -1) uniqueElementCount++;
        }
        return uniqueElementCount;
    }

    public void shiftLeft(int[] nums, int startIndex, int shiftBy) {
        for (int j = startIndex ; j < nums.length - shiftBy ; j++) {
            nums[j] = nums[j + shiftBy];
        }

        for (int j = nums.length - 1 ; j >= nums.length - shiftBy ; j--) {
            nums[j] = -1;
        }
    }
}