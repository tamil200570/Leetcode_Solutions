class Solution 
{
    public int maxProduct(int n) 
    {
          ArrayList<Integer>lis=new ArrayList<>();
          while(n!=0)
          {
            int digit =n%10;
            lis.add(digit);
            n/=10;
          }       
          int max=0;
          for(int i=0;i<lis.size();i++)
          {
            int sum=0;
            for(int j=i+1;j<lis.size();j++)
            {
                  sum=lis.get(i)*lis.get(j);
                  max=Math.max(max,sum);
            }      
          } 
          return max;
    }
}