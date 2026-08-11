class Solution {
    public int minLengthAfterRemovals(String s) {
        int c=0;
        int c1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                c++;
            }
            else
            {
                c1++;
            }
        }
        return Math.abs(c-c1);
    }
}