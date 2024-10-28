class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;

        Arrays.sort(bobSizes);

        for(int aliceCandy : aliceSizes) aliceTotal += aliceCandy;
        for(int bobCandy : bobSizes) bobTotal += bobCandy;

        int n = aliceSizes.length;
        int m = bobSizes.length;

        for(int i = 0; i<n; i++){
            int target = (bobTotal - aliceTotal)/2 + aliceSizes[i];
            int start = 0;
            int end = m-1;

            while(start <= end){
                int mid = start + (end - start)/2;

                if(bobSizes[mid] == target){
                   return new int[]{aliceSizes[i], bobSizes[mid]};
                }else if(bobSizes[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
         }

        return new int[]{-1, -1};
    }
}