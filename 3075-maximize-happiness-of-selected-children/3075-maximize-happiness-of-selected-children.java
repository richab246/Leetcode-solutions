class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        Arrays.sort(happiness);
        int n = happiness.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = happiness[i];
            happiness[i] = happiness[n - 1 - i];
            happiness[n - 1 - i] = temp;
        }

        for(int i=0; i<k; i++){
            if((happiness[i] - i) <0){
                break;
            }else{
               ans += happiness[i]-i;
            }
        }

        return ans;
        
    }
}