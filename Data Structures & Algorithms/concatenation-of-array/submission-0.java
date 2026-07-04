class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for(int n=0;n<nums.length;n++){
            ans[n] = nums[n];
            ans[n + nums.length] = nums[n];
        }
        return ans;
    }
}