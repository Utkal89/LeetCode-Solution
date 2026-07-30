class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int rows=arr.length;int cols=arr[0].length;
        int l=0;int h=rows*cols-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int midrows=mid/cols;int midcols=mid%cols;
            if(arr[midrows][midcols]==target) return true;
            else if(arr[midrows][midcols]>target) h=mid-1;
            else l=mid+1;
        }
        return false;
        
    }
}