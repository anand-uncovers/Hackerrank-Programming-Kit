//You are given two integer arrays A and B, each containing exactly n elements, along with an integer k. Your task is to determine whether it is possible to rearrange the elements of A into some order A' and the elements of B into some order B' such that:
//
//        For every position i (from 0 to n-1), the sum A'[i] + B'[i] is at least k.
//
//        If such a rearrangement exists, output "YES"; otherwise, output "NO".
//        There are q independent test cases. For each test case:
//
//        The first line contains two integers: n (the size of both arrays) and k.
//        The second line contains n space-separated integers representing array A.
//        The third line contains n space-separated integers representing array B.
//
//        You must process all q test cases and print "YES" or "NO" for each.
//
//        Example
//        textInput:
//        2
//        3 10
//        1 2 3
//        7 8 9
//        4 5
//        1 2 2 1
//        3 3 3 4
//
//        Output:
//        YES
//        NO
//        Explanation:
//
//        For the first case (n=3, k=10):
//        One valid permutation is A' = [1, 2, 3] and B' = [9, 8, 7]:
//
//        1 + 9 = 10 ≥ 10
//        2 + 8 = 10 ≥ 10
//        3 + 7 = 10 ≥ 10
//        So, YES.
//
//        For the second case (n=4, k=5):
//        No matter how you pair them, at least one pair will sum to less than 5 (e.g., the smallest in A is 1, largest in B is 4 → 1+4=5 is okay, but multiple small values in A can't all pair with large enough values in B).
//        So, NO.
//
//
//        Constraints
//
//        1 ≤ q ≤ 10
//        1 ≤ n ≤ 1000
//        1 ≤ k ≤ 10⁹
//        0 ≤ A[i], B[i] ≤ 10⁹


import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class PermutingTwoArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here

        // Sort A in ascending order
        Collections.sort(A);

        // Sort B in descending order
        List<Integer> B_desc = new ArrayList<>(B);
        Collections.sort(B_desc, Collections.reverseOrder());

        // Check if A[i] + B_desc[i] >= k for all i
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B_desc.get(i) < k) {
                return "NO";
            }
        }

        return "YES";
    }
}
