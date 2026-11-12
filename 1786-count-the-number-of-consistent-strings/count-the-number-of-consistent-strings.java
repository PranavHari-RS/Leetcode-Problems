class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            hs.add(allowed.charAt(i));
        }
        int count=0;
        for(String word:words){
            boolean flag = true;
            for(int i=0;i<word.length();i++){
                if(!hs.contains(word.charAt(i))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}