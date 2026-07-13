class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> numbersList = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        String num = "123456789";
        int lowDigitCount = 0;
        int left = low;
        int highDigitCount = 0;
        int right = high;
        while(left != 0){
            lowDigitCount++;
            left /= 10;
        }
        while(right != 0){
            highDigitCount++;
            right /= 10;
        }
        for(int i=lowDigitCount; i <= highDigitCount; i++){
            for(int j=0; j<=num.length()-i; j++){
                int n = Integer.parseInt(num.substring(j, j+i));
                numbersList.add(n);
            }
        }
        for(int i=0; i<numbersList.size(); i++){
            if(numbersList.get(i) >= low && numbersList.get(i) <= high)
                res.add(numbersList.get(i));
        }
        
        return res;
    }
}