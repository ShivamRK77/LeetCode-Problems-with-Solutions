class Solution {
    public void sortColors(int[] nums) {
        // This is solved using one Pass Dutch National Flag Algorithm 
        // Here Only pass is used to solve this 
        // This is the Most optimal approach to solve this Question 
        int low  = 0 ;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums , low , mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;

            }else  {
                swap(nums , mid, high);
                high--;
            }


            }
        }

private void swap(int[] nums , int i , int j ){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;

        
    }
}