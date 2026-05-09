class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> arr=new HashSet<Integer>();
        for(int num:nums){
            arr.add(num);
        }
        if(arr.size()!=nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}