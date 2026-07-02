class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=nums[0];
        int numberOfZeros=0;
        for(int i=1;i<nums.length;i++){
           if(nums[i]!=0){
            product=nums[i]*product;
           } else{
            numberOfZeros++;
           }
        }
        for(int k=0;k<nums.length;k++){
            if(numberOfZeros==0){
              nums[k]=product/nums[k];
            }
            if(numberOfZeros==1){
                if(nums[k]!=0){
                  nums[k]=0;
                }else{
                 nums[k]=product;
                }
            }
            if(numberOfZeros>1){
                nums[k]=0;
            }
          
        }
        return nums;
    }
}  
