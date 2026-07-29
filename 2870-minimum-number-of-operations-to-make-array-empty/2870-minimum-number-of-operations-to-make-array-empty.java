class Solution 
{
    public int minOperations(int[] nums) 
    {
         HashMap<Integer,Integer>hs=new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
         }   
         int c=0;
         for(int i : hs.values())
         {
           
            if(i==1)
            {
                return -1;
            }
             c += (i + 2) / 3;
         } 
         return c;
    }
}