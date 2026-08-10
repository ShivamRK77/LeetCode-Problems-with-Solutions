 class Solution {
    public int maxIceCream(int[] costs, int coins) {

        // Find the maximum cost
        int maxCost = 0;

        for (int cost : costs) {
            maxCost = Math.max(maxCost, cost);
        }

        // count[cost] = number of ice creams having this cost
        int[] count = new int[maxCost + 1];

        for (int cost : costs) {
            count[cost]++;
        }

        int total = 0;

        // Go from cheapest to most expensive
        for (int cost = 1; cost <= maxCost; cost++) {

            if (count[cost] == 0) {
                continue;
            }

            // Cannot afford even one ice cream of this cost
            if (coins < cost) {
                break;
            }

            // Number of ice creams we can buy
            int buyKiya = Math.min(count[cost], coins / cost);

            total += buyKiya;

            coins -= buyKiya * cost;
        }

        return total;
    }
}