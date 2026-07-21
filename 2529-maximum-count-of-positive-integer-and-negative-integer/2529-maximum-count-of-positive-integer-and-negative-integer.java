class Solution {
    public int maximumCount(int[] arr) {
        int low=0;int high=arr.length - 1;
        int neg=arr.length;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>=0){
                neg=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        low=0;high=arr.length - 1;
        int pos=arr.length;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>0){
                pos=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        int posi= arr.length-pos;
        return Math.max(neg,posi);
    }
}