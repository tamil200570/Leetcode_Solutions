class Solution {
    public int[] limitOccurrences(int[] nums, int k) 
    {
        int freq[]=new int[1001];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(freq[nums[i]]<=k && freq[nums[i]]>0)
            {
                for(int j=1;j<=freq[nums[i]];j++)
                {
                    list.add(nums[i]);
                }
                freq[nums[i]]=0;
            }
            else if(freq[nums[i]]>k)
            {
                for(int o=1;o<=k;o++)
                {
                    list.add(nums[i]);
                }
                freq[nums[i]]=0;
            }
        }
        int result[]=new int[list.size()];
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            result[i]=list.get(i);
        }
         return result;
    }
}