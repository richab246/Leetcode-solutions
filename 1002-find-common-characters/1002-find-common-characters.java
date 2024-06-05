class Solution {
    public List<String> commonChars(String[] words) {
        
        int[] freq = count(words[0]);
        
        for(int i = 1; i<words.length; i++){
           freq = intersection(freq, count(words[i]));
        }

        List<String> res = new ArrayList<>();
        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                char a = (char)('a'+ i);
                String s = String.valueOf(a);
                while(freq[i] > 0){
                 res.add(s);
                 freq[i]--;
                }
            }
        }

        return res;

    }

    public int[] intersection(int[] a, int[] b){
        int[] t = new int[26];
        for(int i=0; i<26; i++){
            t[i] = Math.min(a[i], b[i]);
        }
        return t;
    }

    public int[] count(String s){
        int[] t = new int[26];
        
        for(char c : s.toCharArray()){
            t[c-'a']++;
        }
        return t;
    }
}