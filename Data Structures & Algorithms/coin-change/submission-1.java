class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

        int[] res = new int[amount+1];
        res[0] = 0;



        if(amount == 0)
            return 0;
        if(coins[0] > amount)
            return -1;

        for(int i=1;i<=amount;i++)
            res[i]=-1;

        for(int i=1; i<=amount; i++) {
            for(int j=0;j<coins.length; j++){
                if(i>=coins[j] && (res[i-coins[j]] != -1)) {
                    if(res[i] == -1)
                        res[i] = res[i-coins[j]]+1;
                    else 
                        res[i] = Math.min(res[i-coins[j]]+1, res[i]);

                }
            }
        }

        for(int i=1;i<=amount;i++)
            System.out.println(res[i]);

        return res[amount] < 0 ? -1 : res[amount];
    }
}
