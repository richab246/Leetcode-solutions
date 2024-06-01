class Solution {
    
    public boolean isAnagram(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public List<String> removeAnagrams(String[] words) {

        List<String> arr = new ArrayList<>();
        arr.add(words[0]);

        for(int i=1; i<words.length; i++){
            if(!isAnagram(words[i], words[i-1])){
                arr.add(words[i]);
            }
        }

        return arr;
    }
}