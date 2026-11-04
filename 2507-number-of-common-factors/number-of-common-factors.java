class Solution {
    public int commonFactors(int a, int b) {
        int s = (a<b)?a:b;
        int count=0;
        while(s>=1){
            if(a%s==0 && b%s==0){
                count++;
            }
            s--;
        }
        return count;
    }
}