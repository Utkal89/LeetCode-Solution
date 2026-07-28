class Solution {
    public int arrangeCoins(long n) {
        long m=(long)n;
        return (sqrt(8*m+1)-1)/2;
    }
    public int sqrt(long n){
        long l=0;long h=n;
        while(l<=h){
            long mid = l+(h-l)/2;
            if(mid==n/mid) return (int)mid;
            else if(mid>n/mid) h=mid-1;
            else l=mid+1;
        }   
        return (int)h;
    }
}