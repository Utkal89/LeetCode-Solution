class Solution {
    public int[] searchRange(int[] arr, int target) {
    //    ArrayList<Integer> ans=new ArrayList<>();
        int low=0;
        int high=arr.length-1;
        int first_idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else{
                first_idx=mid;
                high=mid-1;
            }
        }
      //  ans.add(first_idx);
        low=0;
        high=arr.length-1;
        int Last_idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else{
                Last_idx=mid;
                low=mid+1;
            }
        }//ans.add(Last_idx);
        return new int[]{first_idx, Last_idx};

    }
}