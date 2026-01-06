package Know_Basic_Maths;

import java.util.Scanner;

public class Reverse_Digits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse_num = 0;
        while(n > 0)
        {
            int lastDigit = n % 10;
            n = n / 10;
            reverse_num = reverse_num * 10 + lastDigit;
        }
        System.out.println(reverse_num);
    }
}
