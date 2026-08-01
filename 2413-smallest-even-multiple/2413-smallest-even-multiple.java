class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=1;i<=n;i++)
        {
            int m=i*n;
            if(m%2==0&&m%n==0)
            {
                return m;
            }
        }
        return 2;
    }
}