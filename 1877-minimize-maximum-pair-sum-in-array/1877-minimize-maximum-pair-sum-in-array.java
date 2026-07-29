class Solution 
{
    public int minPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        ArrayList<Integer>list=new ArrayList<>();
        while(l<r)
        {
           
            list.add( nums[l]+nums[r]);
            l++;
            r--;
        }
        int res=0;
        for( int i :list)
        {
            if(i>res)
            {
                res=i;
            }
        }
        return res;
    }
}