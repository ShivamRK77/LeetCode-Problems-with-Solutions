class Solution {
public:
    int maxIceCream(vector<int>& costs, int coins) {
        sort(begin(costs), end(costs));

        int count = 0;
         
       for(int &costs : costs ){
        if(costs > coins){
            return count;
        }else{
            count++;
            coins -= costs;
        }

       }  
       return count; 
        
    }
};