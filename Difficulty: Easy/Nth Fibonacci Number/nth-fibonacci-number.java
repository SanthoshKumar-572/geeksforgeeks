class Solution {
    static int nthFibonacci(int n) {
        return fibo(n);
        
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
        
    }
}