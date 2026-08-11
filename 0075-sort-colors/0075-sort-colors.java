class Solution {
    public void sortColors(int[] nums) {   
        int left = 0;
        int right = nums.length - 1;
        // Move all 0s to the left

        for(int i = 0; i <= right ; i++){
            if(nums[i] == 0){
                swap(nums, i , left);
                left++;
            }
        }
        for(int i = right ; i >= left ; i--){
            if(nums[i] == 2){
                swap(nums , i , right);
                right--;
            }
        }

    }
    private void swap(int[] nums, int i , int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
}