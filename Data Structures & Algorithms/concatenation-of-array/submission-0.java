class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int n = 2 * len;
        int ans[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            ans[i] = nums[i % len];
        }
        return ans;
    }
}