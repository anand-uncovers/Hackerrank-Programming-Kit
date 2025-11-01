//Here are the exact words from the image, formatted cleanly for copy-paste:
//
//        Given an array of integers, where all elements but one occur twice, find the unique element.
//        Example
//        a = [1, 2, 3, 4, 3, 2, 1]
//        The unique element is 4.
//
//        Function Description
//        Complete the lonelyinteger function in the editor below.
//        lonelyinteger has the following parameter(s):
//
//        int a[n]: an array of integers
//
//        Returns
//
//        int: the element that occurs only once
//
//
//        Input Format
//        The first line contains a single integer, n, the number of integers in the array.
//        The second line contains n space-separated integers that describe the values in a.
//
//        Constraints
//
//        1 ≤ n < 100
//        It is guaranteed that n is an odd number and that there is one unique element.
//        0 ≤ a[i] ≤ 100, where 0 ≤ i < n.

//
//
//XOR Method
//import java.util.*;
//
//public class LonelyInteger {
//
//        /** Returns the element that appears only once. */
//        public static int lonelyInteger(int[] a) {
//                int xor = 0;
//                for (int x : a) {
//                        xor ^= x;          // x ^ x == 0, 0 ^ unique == unique
//                }
//                return xor;
//        }
//
//        public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//
//                int n = sc.nextInt();               // first line
//                int[] a = new int[n];
//                for (int i = 0; i < n; i++) {
//                        a[i] = sc.nextInt();            // second line
//                }
//
//                System.out.println(lonelyInteger(a));
//                sc.close();
//        }
//}

import java.util.*;
public class LonelyInteger{

public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:a){
        map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        if (e.getValue() == 1) {
        return e.getKey();
        }
        }
        //System.out.println(map);
        return map.get(1);
        }

        }
