class Solution {
    public String makeGood(String s) {
        StringBuilder st = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(st.length()>0 &&
               Character.toLowerCase(st.charAt(st.length()-1)) == Character.toLowerCase(ch) &&
               st.charAt(st.length()-1)!=ch
            ){
                st.deleteCharAt(st.length()-1);
            }
            else{
                st.append(ch);
            }
        }
        return st.toString();
    }
}