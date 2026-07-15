class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int num = 0;
        for(int i=1; i<=n; i++){
            sumOdd += (++num);
            sumEven += (++num);
        }
        int min = Math.min(sumOdd, sumEven);
        for(int i=(min/2); i>1; i--){
            if(sumOdd % i == 0 && sumEven % i == 0){
                return i;
            }
        }
        return min;
    }
}