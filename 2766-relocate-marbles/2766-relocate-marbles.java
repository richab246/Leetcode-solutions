class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            set.add(num);
        }

        for(int i=0; i<moveFrom.length; i++){
            set.remove(moveFrom[i]);
            set.add(moveTo[i]);
        }

        for(int i: set){
           list.add(i);
        }

        Collections.sort(list);

        return list;
    }
}