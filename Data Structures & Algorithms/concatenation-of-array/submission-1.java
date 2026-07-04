class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>(2*nums.length);
        for(int n=0;n<nums.length;n++){
            ans.add(nums[n]);
        }
        for(int n=0;n<nums.length;n++){
            ans.add(nums[n]);
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }
}