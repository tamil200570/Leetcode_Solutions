class Solution  
{
    public int longestValidParentheses(String s) 
    {
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char k=s.charAt(i);
            if (k=='(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(st.isEmpty())
                {
                    st.push(i);
                }
                else
                {
                    c=Math.max(c,i-st.peek());
                }
                    
            }
        }
        return c;
    }
}