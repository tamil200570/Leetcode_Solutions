class Solution 
{
    public static boolean isvowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) 
    {
       int vowel=0;
       int maxvowel=0;
       int left=0;
       for(int right=0;right<s.length();right++)
       {
        if(isvowel(s.charAt(right))) vowel++;
        if((right-left+1)==k)
        {
            maxvowel=Math.max(vowel,maxvowel);
            if(isvowel(s.charAt(left))) vowel--;
            left++;
        }
       } 
       return maxvowel;
    }
}