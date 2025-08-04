//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
//
//        Example
//
//        The minimum sum is  and the maximum sum is . The function prints
//
//        16 24
//        Function Description
//
//        Complete the miniMaxSum function in the editor below.
//
//        miniMaxSum has the following parameter(s):
//
//        arr: an array of  integers
//        Print
//
//        Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.
//
//        Input Format
//
//        A single line of five space-separated integers.
//
//        Constraints
//
//
//        Output Format
//
//        Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
//
//        Sample Input
//
//        1 2 3 4 5
//        Sample Output
//
//        10 14
//        Explanation
//
//        The numbers are , , , , and . Calculate the following sums using four of the five integers:
//
//        Sum everything except , the sum is .
//        Sum everything except , the sum is .
//        Sum everything except , the sum is .
//        Sum everything except , the sum is .
//        Sum everything except , the sum is .
//        Hints: Beware of integer overflow! Use 64-bit Integer.

import java.util.*;
public class MiniMaxSum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;

        for(int i=0;i<arr.size();i++){
            min=Math.min(arr.get(i),min);
            max=Math.max(arr.get(i),max);
        }

        long min_Sum=0;long max_Sum=0;

        int sum=0;
        if(min==max){
            for(int i=0;i<arr.size()-1;i++)
                sum+=arr.get(i);
            System.out.println(sum+" "+sum);

        }
        else{

            for(int i=0;i<arr.size();i++){
                if(arr.get(i)!=max){
                    min_Sum+=arr.get(i);
                }

                if(arr.get(i)!=min){
                    max_Sum+=arr.get(i);
                }

            }



            System.out.println(min_Sum+" "+max_Sum);
        }
    }

}
