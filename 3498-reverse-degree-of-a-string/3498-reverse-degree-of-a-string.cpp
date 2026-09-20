class Solution {
public:
    int reverseDegree(string s) 
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s[i]=='a')
            {
                sum+=(26*(i+1));
            }
            else if(s[i]=='b')
            {
                sum+=(25*(i+1));
            }
            else if(s[i]=='c')
            {
                sum+=(24*(i+1));
            }
            else if(s[i]=='d')
            {
                sum+=(23*(i+1));
            }
            else if(s[i]=='e')
            {
                sum+=(22*(i+1));
            }
            else if(s[i]=='f')
            {
                sum+=(21*(i+1));
            }
            else if(s[i]=='g')
            {
                sum+=(20*(i+1));
            }else if(s[i]=='h')
            {
                sum+=(19*(i+1));
            }else if(s[i]=='i')
            {
                sum+=(18*(i+1));
            }
            else if(s[i]=='j')
            {
                sum+=(17*(i+1));
            }
            else if(s[i]=='k')
            {
                sum+=(16*(i+1));
            }
            else if(s[i]=='l')
            {
                sum+=(15*(i+1));
            }
            else if(s[i]=='m')
            {
                sum+=(14*(i+1));
            }
            else if(s[i]=='n')
            {
                sum+=(13*(i+1));
            }
            else if(s[i]=='o')
            {
                sum+=(12*(i+1));
            }
            else if(s[i]=='p')
            {
                sum+=(11*(i+1));
            }
            else if(s[i]=='q')
            {
                sum+=(10*(i+1));
            }
            else if(s[i]=='r')
            {
                sum+=(9*(i+1));
            }
            else if(s[i]=='s')
            {
                sum+=(8*(i+1));
            }
            else if(s[i]=='t')
            {
                sum+=(7*(i+1));
            }
            else if(s[i]=='u')
            {
                sum+=(6*(i+1));
            }
            else if(s[i]=='v')
            {
                sum+=(5*(i+1));
            }
            else if(s[i]=='w')
            {
                sum+=(4*(i+1));
            }
            else if(s[i]=='x')
            {
                sum+=(3*(i+1));
            }
            else if(s[i]=='y')
            {
                sum+=(2*(i+1));
            }
            else if(s[i]=='z')
            {
                sum+=(1*(i+1));
            }
           
        }
      return sum;
    }
};