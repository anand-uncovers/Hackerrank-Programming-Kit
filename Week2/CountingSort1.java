//Problem: Counting Sort 1
//        Goal:
//        Count how many times each number from 0 to 99 appears in a list, and return those counts as a list of exactly 100 numbers.
//
//        Input
//        First line: an integer n → number of elements (100 ≤ n ≤ 1,000,000)
//        Second line: n integers, each between 0 and 99
//        Output
//        A single line with 100 space-separated numbers
//        → The i-th number tells: "How many times does the value i appear?"
//
//        Even if a number never appears, put 0.
//
//        Example
//        Input:
//
//        text
//        4
//        1 1 3 2
//        Step-by-step counting:
//
//        0 → never appears → 0
//        1 → appears 2 times
//        2 → appears 1 time
//        3 → appears 1 time
//        4 to 99 → never appear → 0
//        Output (only first 10 shown):
//
//        text
//        0 2 1 1 0 0 0 0 0 0 ...
//        (And 96 more zeros → total 100 numbers)
//
//        Sample Input (from your image)
//        text
//        100
//        63 25 73 1 98 ... (100 numbers)
//        Sample Output:
//
//        text
//        0 2 0 2 0 0 1 0 1 2 ... (100 numbers total)
//        → Means:
//
//        0 appears 0 times
//        1 appears 2 times
//        2 appears 0 times
//        3 appears 2 times
//        and so on...

import java.util.*;
public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] freq = new int[100];          // frequency array of size n

        // count occurrences
        for (int x : arr) {
            freq[x]++;
        }

        // convert int[] to List<Integer>
        List<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < 100; i++) {
            result.add(freq[i]);
        }
        return result;
    }

    }
