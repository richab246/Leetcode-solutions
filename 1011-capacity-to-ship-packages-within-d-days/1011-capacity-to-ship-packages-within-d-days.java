class Solution {

    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int minWeight = weights[0];
        int ans = 0;

        for(int i=0; i<weights.length; i++){
            maxWeight += weights[i];
            minWeight = Math.max(minWeight, weights[i]);
        }

        while(minWeight < maxWeight){
            int mid = minWeight + (maxWeight - minWeight)/2;
            int daysNeed = 1, curr = 0;

            for(int w : weights){
                if(curr + w > mid){
                    daysNeed++;
                    curr = 0;
                }
                curr += w;
            }

            if(daysNeed > days){
                minWeight = mid + 1;
            }else{
                maxWeight = mid;
            }
            
        }

        return minWeight;
    }
}