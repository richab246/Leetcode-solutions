class Solution {
    public char repeatedCharacter(String s) {
        int[] count = new int[26];


        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            count[c-'a']++;
            if(count[c-'a'] == 2){
                return c;
            }
        }
        return ' ';
    }
}