class Solution 
{
    public int maximumGap(int[] nums) 
    {
        if(nums.length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
       int min=Integer.MIN_VALUE;
       for(int i=0;i<nums.length-1;i++)
       {
        int sum=Math.abs(nums[i]-nums[i+1]);
        min=Math.max(min,sum);
       }   
       return min;
    }
    
}