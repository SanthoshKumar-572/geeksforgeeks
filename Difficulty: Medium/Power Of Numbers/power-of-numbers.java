class Solution {
    public int reverseExponentiation(int n) {
        int temp=n;
        int res=0;
        while(n>0){
            int temp1=n%10;
            res=(res*10)+temp1;
            n=n/10;
        }
        int result=(int)Math.pow(temp,res);
        return result;
    }
}
