//You will be given a list of 32-bit unsigned integers. Flip all the bits (1 → 0 and 0 → 1) and return the result as an unsigned integer.
//
//        Example
//        n = 9₁₀
//        9₁₀ = 1001₂. We're working with 32 bits, so:
//        00000000000000000000000000001001₂ = 9₁₀
//        11111111111111111111111111110110₂ = 4294967286₁₀
//        Return 4294967286.
//
//        Function Description
//        Complete the flippingBits function in the editor below.
//        flippingBits has the following parameter(s):
//
//        int n: an integer
//
//        Returns
//
//        int: the unsigned decimal integer result
//
//
//        Input Format
//        The first line of the input contains q, the number of queries.
//        Each of the next q lines contain an integer, n, to process.
//
//        Constraints
//
//        1 ≤ q ≤ 100
//        0 ≤ n < 2³²
//
//
//        Sample Input
//        text3
//        9
//        2147483647
//        1
//        Sample Output
//        text4294967286
//        2147483648
//        4294967294


public class FlippingBits {
    public static long flippingBits(long n) {
    // return n ^ 0xFFFFFFFFL;  // XOR with all 1s (32-bit mask)

    long result = 0;
    for (int i = 0; i < 32; i++) {
        if ((n & (1L << i)) == 0) {
            result |= (1L << i);  // set bit if original was 0
        }
        // else: leave as 0 (original was 1)
    }
    return result;

}
}
