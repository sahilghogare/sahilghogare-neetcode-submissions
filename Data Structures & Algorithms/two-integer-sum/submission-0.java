class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> newmap = new HashMap<>();

        for(int i = 0;i < nums.length;i++)
        {
            int complement = target - nums[i];
            if(newmap.containsKey(complement))
            {
                return new int[]{newmap.get(complement), i};
            }
            newmap.put(nums[i], i);
        }
        return new int[]{};
    }
}
