class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res;
        for(int i=0;i<nums.length;i++){
            res=target-nums[i];
            if(map.containsKey(res)){
                return new int[] {map.get(res),i};
            }
            map.put(nums[i],i);
            
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
