class Solution 
{
    public boolean isSameAfterReversals(int num) 
    {
         if(num<10)
         {
            return true;
         }
         int og=num;
         int dup=num;
         int rev1=0;
         while(dup!=0)
         {
            int d=dup%10;
            rev1=rev1*10+d;
            dup/=10;
         }
         while(rev1!=0)
         {
            int d=rev1%10;
            dup=dup*10+d;
              rev1/=10;
         }
        return og==dup;
    }
}