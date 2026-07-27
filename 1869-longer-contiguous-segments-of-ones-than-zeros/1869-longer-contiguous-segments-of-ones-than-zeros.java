class Solution 
{
    public boolean checkZeroOnes(String s) 
    {
        int max1=0;
        int max2=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='1')
            {
                c1++;
            }
            else 
            {
                max1=Math.max(max1,c1);
                c1=0;
            }
            if(c=='0')
            {
                c2++;
            }
            else 
            {
                max2=Math.max(max2,c2);
                c2=0;
            }
        }
        max1=Math.max(max1,c1);
        max2=Math.max(max2,c2);
        if(max1>max2)
        {
            return true;
        }
        return false;
    }
}