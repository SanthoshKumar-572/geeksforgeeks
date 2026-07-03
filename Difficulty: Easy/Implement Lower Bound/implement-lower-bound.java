class Solution {
    int lowerBound(int[] arr, int target) {
        
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(ans==-1){
            return n;
        }
        
        return ans ;
    }
}
