package Know_Basic_Maths;

import java.util.Scanner;

public class Palindrome_Check
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int reverse_num = 0;
        int Duplicate = n;
        while(n > 0)
        {
            int LastDigit = n % 10;
            reverse_num = (reverse_num * 10) + LastDigit;
            n = n / 10;
        }
        if(Duplicate ==  reverse_num)
        {
            System.out.println("This Number is Palindrome");
        }
        else
        {
            System.out.println("This Number is not Palindrome");
        }
    }
}
