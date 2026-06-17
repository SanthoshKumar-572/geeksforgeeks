class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        int maxi=arr[0];
        int min=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        ans.add(min);
        ans.add(maxi);
        return ans;
    
        
    }
}
