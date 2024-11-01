class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(i+2 < s.length() && s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)){
            }else{
                str.append(s.charAt(i));
            }
           
        }

        return str.toString();

    }
}