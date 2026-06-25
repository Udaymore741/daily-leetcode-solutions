class Solution {
    public int scoreOfString(String s) {
        int add = 0 ;
        for(int i = 0 ; i<s.length()-1;i++){
            int a = s.charAt(i)-s.charAt(i+1);
            add +=Math.abs(a);
        }
        return add ;
        
    }
}