class Solution 
{
    public void duplicateZeros(int[] arr)
    {
        int j=0;
        int nums[]=new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(j>=arr.length)
            {
                break;
            }
            if(arr[i]!=0)
            {
                nums[j++]=arr[i];
            }
            else{
                nums[j++]=arr[i];
                if(j<arr.length)
                {
                nums[j++]=0;
                }
            }
        } 
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
    }
}