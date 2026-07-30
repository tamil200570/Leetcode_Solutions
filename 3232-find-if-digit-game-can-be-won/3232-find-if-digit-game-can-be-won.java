class Solution {
    public boolean canAliceWin(int[] nums) 
    {
         int s1=0;
         int s2=0;
         for(int i : nums)
         {
            if(i>=10)
            {
                s2+=i;
            }
            else
            {
                s1+=i;
            }
         }
      
         return s1!=s2;
    }
}