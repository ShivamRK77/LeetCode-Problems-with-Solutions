class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);

        int i = 0  , j = 0;

        for(int k = 2 ; k < nums.length ; k++){
            if(list1.get(i) > list2.get(j)){
                list1.add(nums[k]);
                i++;
            }
            else{
                list2.add(nums[k]);
                j++;
            }
        } 
        int k = 0;

        for(int num : list1){
            nums[k++] = num;

        }
        for(int num : list2){
            nums[k++] = num;
        }
        return nums;

    }
}