// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int temp=n;
        int count=0;
        while(n>0){
            int res=n%10;
            
            if( res!=0 &&  temp%res==0){
                count+=1;
            }
            n=n/10;
        }
        return count;
        
    }
}