/* class Solution {
    public int fib(int n) {
       if(n==0){
        return 0;
       }else if(n==1){
        return 1;
       }
       int firstterm=0;
       int secondterm=1;
        for(int i=1; i<=n;i++){
        int thirdterm = firstterm + secondterm;
        firstterm = secondterm;
        secondterm = thirdterm;
       }
       return firstterm;
       }
    }
 */
/* class Solution {

    public int fib(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    private int solve(int n, int[] dp) {

        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);

        return dp[n];
    }
}
*/

/* class Solution {

    public int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
} */

class Solution {

    public int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {

            int curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}