class Solution 
{
    public int maxPower(String s) 
    {
         int c=0;
         char ch=s.charAt(0);
         int max=0;
         for(int i=0;i<s.length();i++)
         {
             if(ch==s.charAt(i))
             {
                c++;
             }
             else
             {
                max=Math.max(c,max);
                ch=s.charAt(i);
                c=1;
             }
         }
         return Math.max(max,c);
    }
}