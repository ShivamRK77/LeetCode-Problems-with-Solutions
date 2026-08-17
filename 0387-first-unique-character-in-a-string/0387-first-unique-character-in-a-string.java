class Solution {
    public int firstUniqChar(String s) {

        // This approach leads to TLE as this is Brute force

        // for(int i = 0 ; i < s.length() ; i++){
        //     int count = 0;
        //      for(int j = 0; j < s.length() ; j++){
        //         if(s.charAt(i) == s.charAt(j)){
        //             count++;
        //         }
        //      }
        //         if(count == 1){
        //             return i;
        //         }
        //  }
           
        // return -1;


 // Better Approach is to use the Hashmap


        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {

            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;


 // Optimal Approach is to use Frequency Array

 
         






        
    }
}