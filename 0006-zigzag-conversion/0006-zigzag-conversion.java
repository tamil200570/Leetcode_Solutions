class Solution 
{
    public String convert(String s, int numRows) 
    {
        int n=numRows;
        if(n==1||s.length()<=n)
        {
            return s;
        }
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
          a[i]="";
        }
        int cur=0;
        boolean flag=false;
        for(char c : s.toCharArray())
        {
            a[cur]+=c;
            if(cur==0||cur==n-1)
            {
                flag=!flag;
            }
            cur+=flag?1:-1;
        }
        String s1="";
        for(String k : a)

        {
            s1+=k;
        }
        return s1;
    }
}