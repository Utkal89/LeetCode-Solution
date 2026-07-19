class Solution {
    public int maximumCount(int[] nums) {
        int low=0;int high = nums.length-1;
        int negcount=nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=0){
                negcount=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }}
        low=0;high=nums.length-1;
        int poscount=nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>0){
                poscount=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
               int poCount = nums.length - poscount;
        return Math.max(negcount,poCount);
    }
}