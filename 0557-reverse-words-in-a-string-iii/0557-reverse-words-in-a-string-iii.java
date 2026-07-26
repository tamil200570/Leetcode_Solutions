class Solution 
{
    public String reverseWords(String s)
    {
        String words[]=s.split(" ");
        String s1="";
        for(int i=0;i<words.length;i++)
        {
              String s2=words[i];
              for(int j=s2.length()-1;j>=0;j--)
              {
                s1+=s2.charAt(j);
              }
              if(i!=words.length-1)
              {
                 s1+=" ";
              }
        }   
        return s1;
    }
}