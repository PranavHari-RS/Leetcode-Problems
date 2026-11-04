class Solution {
    public boolean isThree(int n) {
        int temp = n;
        int count=0;
        while(temp>=1){
            if(n%temp==0){
                count++;
            }
            temp--;
        }
        if(count==3){
            return true;
        }
        return false;
    }
}