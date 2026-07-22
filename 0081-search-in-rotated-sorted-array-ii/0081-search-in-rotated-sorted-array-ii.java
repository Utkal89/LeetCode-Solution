class Solution {
    public boolean search(int[] arr, int target) {
        int lo=0;int hi=arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target) return true;
            if(arr[lo]==arr[mid] && arr[mid]==arr[hi]){
                lo++;
                hi--;
            }
            else if(arr[mid]>= arr[lo]){
                if(arr[mid]>=target && target>=arr[lo]) hi = mid-1;
                else lo=mid+1;
            }else{
                if(arr[hi]>=target && target>=arr[mid]) lo = mid+1;
                else hi=mid-1;
            }
           // return true;

        }
        return false;
    }
}