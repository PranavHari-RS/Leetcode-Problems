class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for(int i=0;i<chars.length();i++){
            freq[chars.charAt(i)-'a']++;
        }
        int total=0;
        for(String word:words){
            int[] temp = freq.clone();
            boolean flag = true;
            for(int i=0;i<word.length();i++){
                int index = word.charAt(i)-'a';
                if(temp[index]>0){
                    temp[index]--;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                total+=word.length();
            }
        }
        return total;
    }
}