class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // sort the costs in ascending order
        Arrays.sort(costs);

        int count = 0;

        for(int cost : costs){
            if(cost > coins){
                return count;
            }else{
                count++;
                coins -= cost; 
            }
        }

return count;
         


        
    }
}