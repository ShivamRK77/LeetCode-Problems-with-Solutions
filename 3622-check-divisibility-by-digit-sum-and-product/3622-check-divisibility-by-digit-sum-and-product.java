class Solution {
    public boolean checkDivisibility(int n) {

    int k = n;
     int sum = 0;
       int product = 1;

        while(k > 0){
            
            sum += k % 10;
            product *= k%10;

            k /= 10;

        }        
        return n%(sum +product) == 0;
        
    }
}