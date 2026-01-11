package Learn_Basic_Recursion;

import java.util.Scanner;

public class Print_Value_N_Times
{
    // ----- 1 to N-----
    public static void PrintNumbers(int n)
    {
        if(n == 0)
        {
            return;
        }
        PrintNumbers(n-1);
        System.out.println(n);
    }
    //-----N to 1----
//    public static void printNumbers(int n)
//    {
//        if(n==0)
//        {
//            return ;
//        }
//        System.out.println(n);
//        printNumbers(n-1);
//    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintNumbers(n);
    }
}
