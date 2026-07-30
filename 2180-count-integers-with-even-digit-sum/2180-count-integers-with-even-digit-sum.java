class Solution {
    public int countEven(int num) {
        int c=0;
        for( int i=2;i<=num;i++)
        {
            int n=0;
            int j=i;
            if(j>=10)
            {
               while(j!=0)
               {
                int digit =j%10;
                n+=digit;
                j/=10;
               }  
            }
            else
            {
                n=i;
            }
            if(n%2==0&&n<=num)
            {
                c++;
            }
        }
        return c;
    }
}