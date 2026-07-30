class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int rows=0;int cols=arr[0].length-1;
        //int l=0;int h=rows*cols-1;
        while(cols>=0 && rows<=arr.length-1){
            if(target == arr[rows][cols]) return true;
            else if(target < arr[rows][cols]) cols--;
            else rows++;
        }
        return false;
    }
}