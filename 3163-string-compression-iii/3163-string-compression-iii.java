class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 0, j = 0;

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            j = i;
            while(j < word.length() && word.charAt(j) == ch){
                count++;
                j++;
            }
            while(count > 9){
                comp.append(9);
                comp.append(ch);
                count -= 9;
            }
            comp.append(count);
            comp.append(ch);
            count = 0;
            i=j-1;
        }

        return comp.toString();

    }
}