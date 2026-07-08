class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        String x = "";
        long sum = 0;
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch != '0'){
                x+= ch;
            }
        }

        for(char i : x.toCharArray()){
            sum+= (i - '0');
        }

        if(x.equals("")){
            x = "0";
        }

        return Long.parseLong(x) * sum ;
    }
}