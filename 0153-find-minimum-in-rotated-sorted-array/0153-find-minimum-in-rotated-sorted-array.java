class Solution {
    public int findMin(int[] arr) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(arr[hi]<arr[mid]){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return arr[lo];
    }
}