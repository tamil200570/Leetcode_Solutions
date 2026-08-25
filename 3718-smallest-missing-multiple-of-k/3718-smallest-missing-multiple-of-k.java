class Solution 
{
    public int missingMultiple(int[] nums, int k) 
    {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
            list2.add(k*(i+1));
        }
        for(int i : list2)
        {
            if(!list.contains(i))
            {
                return i;
            }
        }
        return (nums.length+1)*k;
    }
}