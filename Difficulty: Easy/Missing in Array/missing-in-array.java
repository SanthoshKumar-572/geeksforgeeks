class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        long sum_arr = 0;
        long total = (long) n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum_arr += arr[i];
        }

        return (int)(total - sum_arr);  
        
    }
}