class Solution {
    public int rob(int[] nums) {
        int p = 0;
        int m = 0;
        for(int c : nums){
            int t = Math.max(m , p +c);
            p = m;
            m = t;
        }
        return m;
        
    }
}