package Know_Basic_Maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_All_Divisors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Brute Force Approach
        for(int i = 1 ; i <= n ; i++)
        {
            if (n % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}

// Optimal Solution

//class Solution
//{
//    public List<Integer> getDivisors(int N) {
//        List<Integer> res = new ArrayList<>();
//        for (int i = 1; i * i <= N; i++) {
//            if (N % i == 0)
//            {
//                res.add(i);
//                if (i != N / i) {
//                    res.add(N / i);
//                }
//            }
//        }
//        return res;
//    }
//}
//
//public class Main
//{
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int N = 36;
//        List<Integer> result = sol.getDivisors(N);
//        System.out.print("Divisors of " + N + ": ");
//        for (int val : result) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
//    }
//}
