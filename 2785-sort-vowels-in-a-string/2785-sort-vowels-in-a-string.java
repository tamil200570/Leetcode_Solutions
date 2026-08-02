class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>list=new ArrayList<>();
        char s1[]=new char[s.length()];
        int i=0;
        for(char ch : s.toCharArray())
        {
            s1[i++]=ch;
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')  
            {
                list.add(ch);    
            }
        }
        Collections.sort(list);
        int j=0;
        for( i=0;i<s1.length;i++)
        {
             if(s1[i]=='A'||s1[i]=='E'||s1[i]=='I'||s1[i]=='O'||s1[i]=='U'||s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u')  
            {
                s1[i]=list.get(j++);    
            }
        }
        String s2="";
        for(char k : s1)
        {
            s2+=k;
        }
        return s2;
    }
}