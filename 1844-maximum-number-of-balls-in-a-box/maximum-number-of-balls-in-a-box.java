class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        for(int i=lowLimit;i<=highLimit;i++){
            int sum = 0;
            int num = i;
            while(num>0){
                sum+=num%10;
                num = num/10;
            }
            arr[sum]++;
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}