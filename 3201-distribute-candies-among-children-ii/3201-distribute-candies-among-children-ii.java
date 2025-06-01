import java.math.BigInteger;

class Solution {
    public long distributeCandies(int n, int limit) {
        BigInteger total = nCk(n + 2, 2);

        for (int i = 1; i <= 3; i++) {
            int remaining = n - (limit + 1) * i;
            if (remaining >= 0) {
                BigInteger sign = (i % 2 == 1) ? BigInteger.valueOf(-1) : BigInteger.ONE;
                BigInteger comb = nCk(3, i);
                BigInteger ways = nCk(remaining + 2, 2);
                total = total.add(sign.multiply(comb).multiply(ways));
            }
        }

        return total.longValue();
    }

    private BigInteger nCk(int n, int k) {
        if (k < 0 || k > n) return BigInteger.ZERO;
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            res = res.multiply(BigInteger.valueOf(n - i + 1));
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
}
