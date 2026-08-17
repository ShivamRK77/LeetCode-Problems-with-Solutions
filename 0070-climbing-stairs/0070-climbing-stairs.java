class Solution {
    public int climbStairs(int n) {
        if(n  == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int fs = 1;
        int ss = 1;
        int as = 0;

        for(int i = 2; i <= n ; i++ ){
            as = ss + fs;
            fs = ss;
            ss = as;

        }
        return as;
        
    }
}