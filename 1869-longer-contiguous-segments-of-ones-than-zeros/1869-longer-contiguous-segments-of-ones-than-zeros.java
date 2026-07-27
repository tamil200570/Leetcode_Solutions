class Solution {
    public boolean checkZeroOnes(String s) {
        int currOne = 0;
        int currZero = 0;
        int maxOne = 0;
        int maxZero = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                currOne++;
                currZero = 0;
                maxOne = Math.max(maxOne, currOne);
            }else{
                currZero++;
                currOne = 0;
                maxZero = Math.max(maxZero, currZero);
            }
        }
        if(maxOne > maxZero){
            return true;
        }else{
            return false;
        }
    }
}