import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

      HashMap<Integer ,Integer>Map = new HashMap<>();

  for(int i=0 ;i<nums.length ;i++){
    int nedded =target - nums[i]; 
    
    if(Map.containsKey(nedded)){
        return new int[] {Map.get(nedded),i};
 
    }
    Map.put(nums[i],i);
  }
        return new int[] {};
    }
}
