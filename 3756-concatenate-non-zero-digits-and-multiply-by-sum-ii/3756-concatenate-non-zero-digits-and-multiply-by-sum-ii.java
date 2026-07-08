class Solution {
    int MOD = 1000000007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int[] ans = new int[queries.length];
        
            long[] prefixSum = new long[n + 1];
        
        long[] prefixVal = new long[n + 1];
   
        long[] powerOf10 = new long[n + 1];
        
        powerOf10[0] = 1;
        int nonZeroCount = 0;
        
        
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            
            if (digit != 0) {
                prefixSum[nonZeroCount + 1] = (prefixSum[nonZeroCount] + digit) % MOD;
                prefixVal[nonZeroCount + 1] = (prefixVal[nonZeroCount] * 10 + digit) % MOD;
                powerOf10[nonZeroCount + 1] = (powerOf10[nonZeroCount] * 10) % MOD;
                nonZeroCount++;
            }
        
        }
        
        
        int[] nextNonZero = new int[n + 1];
        int currNonZeroIdx = 0;
        for (int i = 0; i < n; i++) {
            nextNonZero[i] = currNonZeroIdx;
            if (s.charAt(i) != '0') {
                currNonZeroIdx++;
            }
        }
        nextNonZero[n] = currNonZeroIdx;

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            
        
            int L = nextNonZero[left];
            int R = nextNonZero[right + 1];
            
            if (L >= R) {
                
                ans[i] = 0;
                continue;
            }
            
            long sum = (prefixSum[R] - prefixSum[L] + MOD) % MOD;
            
           
            int segmentLength = R - L;
            long val = (prefixVal[R] - (prefixVal[L] * powerOf10[segmentLength]) % MOD + MOD) % MOD;
            
            ans[i] = (int) ((sum * val) % MOD);
        }
        
        return ans;
    }
}