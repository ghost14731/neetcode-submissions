class Solution {
    public boolean hasDuplicate(int[] nums) {
        int target=0; 
      for(int i=0;i<nums.length;i++){
        target=nums[i];
        for(int j=i+1;j<nums.length;j++){
            if(target==nums[j]){
                return true;
            }
    }
    
     }


     return false;
}}