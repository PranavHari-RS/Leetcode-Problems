class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n+n];
        int j=0;
        for(int i=0;i<ans.length;i++){
            if(j==n){
                j=0;
            }
            ans[i]=nums[j++];
        }
        return ans;
    }
}