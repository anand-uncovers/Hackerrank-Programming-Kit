//Here is the complete, clean text extracted from the image — formatted for copy-paste into documentation, code comments, or HackerRank submission:
//
//        Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//        For example, the square matrix arr is shown below:
//        text1  2  3
//        4  5  6
//        7  8  9
//        The left-to-right diagonal = 1 + 5 + 9 = 15. The right-to-left diagonal = 3 + 5 + 7 = 17. Their absolute difference is |15 - 17| = 2.
//
//        Function Description
//        Complete the diagonalDifference function in the editor below.
//        diagonalDifference takes the following parameter:
//
//        int arr[n][n]: an array of integers
//
//        Return
//
//        int: the absolute diagonal difference
//
//
//        Input Format
//        The first line contains a single integer, n, the number of rows and columns in the square matrix arr.
//        Each of the next n lines describes a row, arr[i], and consists of n space-separated integers arr[i][j].
//
//        Constraints
//
//        -100 ≤ arr[i][j] ≤ 100
//
//
//        Output Format
//        Return the absolute difference between the sums of the matrix’s two diagonals as a single integer.
//
//        Sample Input
//        text3
//        11 2 4
//        4 5 6
//        10 8 -12
//        Sample Output
//        text15
//
//        Explanation
//        The primary diagonal is:
//        text11
//        5
//        -12
//        Sum across the primary diagonal: 11 + 5 + (-12) = 4
//        The secondary diagonal is:
//        text4
//        5
//        10
//        Sum across the secondary diagonal: 4 + 5 + 10 = 19
//        Difference: |4 - 19| = 15
//
//        Note: |x| is the absolute value of x

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        // {{1,2,3}{4,5,6}{7,8,9}}
        //((0,0), (1,1), (2,2))  ((0,2)(1,1)(2,0))
        //d1= i==j   i+j=n-1

        int d1=0;
        int d2=0;

        int n1=arr.size();

        for(int i=0;i<n1;i++){

            d1+=arr.get(i).get(i);

            d2+=arr.get(i).get(n1-1-i);
        }

        if(d1>d2)return d1-d2;

        return d2-d1;

    }

}
