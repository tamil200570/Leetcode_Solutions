int countDigitOccurrences(int* nums, int numsSize, int digit) 
{
     int c=0;
          for(int i=0;i<numsSize;i++)
          {
            while(nums[i]!=0)
            {
                int d=nums[i]%10;
                if(d==digit)
                {
                    c++;
                }
                nums[i]/=10;
            }
          }    
          return c;    
}