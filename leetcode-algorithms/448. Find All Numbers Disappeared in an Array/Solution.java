class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>res = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
                int index = Math.abs(nums[i]) -1;
                nums[index] = Math.abs(nums[index]) *-1;
        }
        
        for(int j=0;j<nums.length;j++) {
            if(nums[j]>0){
                res.add(j+1);
            }
        }
        
        return res;
    }
}
