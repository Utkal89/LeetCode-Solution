class Solution {
    public int mySqrt(int x) {
        int l=1;int h=x;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid>x/mid) h=mid-1;
            else if(mid<x/mid) l=mid+1;
            else return mid;
        }
        return h;
        
    }
}