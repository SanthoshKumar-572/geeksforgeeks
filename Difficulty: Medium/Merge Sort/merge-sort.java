class Solution {
    public void mergeSort(int arr[], int l, int r) {
        l=0;
        r=arr.length-1;
        mergesorts(arr,l,r);
        
        
    }
    public static void mergesorts(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        
        mergesorts(arr,low,mid);
        mergesorts(arr,mid+1,high);
        Merge(arr,low,mid,high);
    }
    public static void Merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer>ans=new ArrayList<>();
        
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                ans.add(arr[left]);
                left++;
            }
            else{
                ans.add(arr[right]);
                right++;
            }
            
        }
        while(left<=mid){
            ans.add(arr[left]);
            left++;
        }
        while(right<=high){
            ans.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=ans.get(i-low);
        }
    }
    
}