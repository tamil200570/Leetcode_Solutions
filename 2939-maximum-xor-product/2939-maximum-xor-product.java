class Solution {
    public int maximumXorProduct(long a, long b, int n) {
        final long MOD = 1_000_000_007L;

        // Preserve bits that x cannot change.
        long ax = (a >> n) << n;
        long bx = (b >> n) << n;

        for (int i = n - 1; i >= 0; i--) {
            long bitA = (a >> i) & 1L;
            long bitB = (b >> i) & 1L;

            if (bitA == bitB) {
                ax |= 1L << i;
                bx |= 1L << i;
            } else if (ax > bx) {
                bx |= 1L << i;
            } else {
                ax |= 1L << i;
            }
        }

        return (int) ((ax % MOD) * (bx % MOD) % MOD);
    }
}