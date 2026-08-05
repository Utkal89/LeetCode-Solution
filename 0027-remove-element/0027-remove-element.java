class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length -1;
       if(nums.length<1)
            return 0;
        while(i<j){
            if(nums[i] == val){
               int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = nums[i];
                j--;
            }
            else{
                i++;
            }
        }
        if(nums[i] == val)
        {
            
            return i;
        }
        return i+1;
    }
}