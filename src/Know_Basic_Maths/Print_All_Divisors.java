package Know_Basic_Maths;

import java.util.Scanner;

public class Print_All_Divisors
{
    public static void main(String[] args)
    {
        // Brute Force Approach
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
