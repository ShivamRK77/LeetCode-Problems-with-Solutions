class Solution {
    public int trailingZeroes(int n) {

        int count = 0 ;

        while( n > 0){
         n = n / 5;
         count = count + n;

        }
        return count;

        // long fact =1;
        // int count=0;
        // for(int i=n;i>=1;i--){
        //     fact = fact * i;
        // }
        // Divisor = Divident + Quotient + Remainder;
         





        // while(fact>0){
        //     long ld=fact%10;
        //     if(ld==0){
        //         count++;
        //     }
        //     else{
        //         break;
        //     }
        //     fact=fact/10;
        // }
        // return count;
    }
}