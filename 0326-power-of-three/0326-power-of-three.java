 class Solution {
    public boolean isPowerOfThree(int n) {
        // Base Cases
        if (n <= 0) return false;
        if (n == 1) return true;

        //  not divisible by 3,  then not power of 3
        if (n % 3 != 0) return false;

       // Recursive Call 
        return isPowerOfThree(n /3);
 
    }
}