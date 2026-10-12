class Solution {
    public int minMoves(int[] nums) {
       int m=Integer.MAX_VALUE;
       for(int n : nums)
       {
        m=Math.min(n,m);
       }
       int ans=0;
       for(int n : nums)
       {
        ans+=n-m;
       }
       return ans;
    }
}