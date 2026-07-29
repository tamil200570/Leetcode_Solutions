class Solution 
{
    public int maxCoins(int[] piles) 
    {
        int n=piles.length/3;
        int c=0;
        int sum=0;
        Arrays.sort(piles);
        for(int i=piles.length-1;i>=0;i--)
        {
            if(piles.length%2==0)
            {
            if(i%2==0)
            {
                sum+=piles[i];
                c++;
            }
            }
            else
            {
                if(i%2!=0)
            {
                sum+=piles[i];
                c++;
            } 
            }
            if(c==n)
            {
                break;
            }
        }
        return sum;
    }
}