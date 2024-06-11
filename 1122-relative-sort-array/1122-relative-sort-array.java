class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[arr1.length];
        int j = 0;

        for(int num : arr1){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }


        for(int num : arr2){
            while( map.get(num) > 0){
              res[j] = num;
              map.put(num, map.get(num)-1);
              j++;
            }
            map.remove(num);
        }

        int[] remaining = new int[arr1.length - j];
        int i = 0;
        
        for(int num : arr1){
          if(map.containsKey(num)){
            while(map.get(num) > 0){
                remaining[i] = num;
                i++;
                map.put(num, map.get(num)-1);
            }
            map.remove(num);
          }
        }
        Arrays.sort(remaining);
        for(int num : remaining){
            res[j] = num;
            j++;
        }

        return res;
        
    }
}