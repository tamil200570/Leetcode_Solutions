class Solution {
    public int countElements(int[] nums, int k) 
    {
        int c=0;
        if(k==0)
        {
            return nums.length;
        }
        Arrays.sort(nums);
        int max=nums[nums.length-k];
        for(int n : nums)
        {
            if(n <max)
            {
                c++;
            }
        }
        return c;
    }
}