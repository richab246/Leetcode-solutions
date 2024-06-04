class Solution {
    public int longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int count = 0;

        int i = 0;
        while(i<arr.length-1){
            if(arr[i] == arr[i+1]){
                count+=2;
                i+=2;
            }else{
              i++;
            }
        }
        if(count == s.length()){
            return count;
        }else{
            return count+1;
        }
          
    }
}