class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map=new HashMap<>();
       for( String c : strs)
       {
        char ch[]=c.toCharArray();
        Arrays.sort(ch);
        String n=new String(ch);
        map.putIfAbsent(n,new ArrayList<>());
        map.get(n).add(c);
       }
       return new ArrayList<>(map.values());

    }
}