class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i < nums.length; i ++) {
            int count = 0 ;
            if(!hashMap.containsKey(nums[i])) {
                count = count +1;
                hashMap.put(nums[i], count);
            } else {
                count = hashMap.get(nums[i]);
                count = count +1;
                hashMap.put(nums[i], count);
            }
            
        }
        
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > (nums.length/2))
            {
                return entry.getKey();
            }            
        }
        return 0;
    }
}
