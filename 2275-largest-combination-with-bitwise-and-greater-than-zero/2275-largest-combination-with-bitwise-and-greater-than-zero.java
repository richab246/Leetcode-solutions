class Solution {
    public int largestCombination(int[] candidates) {
        int[] bitCount = new int[32];

        for(int i=0; i<bitCount.length; i++){
            for(int can : candidates){
                if(((can >> i) & 1) == 1){
                    bitCount[i]++;
                }
            }
        }
        int ans = 0;
        for(int count: bitCount){
            ans = Math.max(count, ans);
        }

        return ans;
    }
}