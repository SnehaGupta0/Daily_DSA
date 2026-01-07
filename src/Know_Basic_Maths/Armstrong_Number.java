package Know_Basic_Maths;
import java.util.Scanner;

public class Armstrong_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int duplicate = n;
        while(n > 0)
        {
            int LastDigit = n % 10;
            sum = sum + (LastDigit * LastDigit *  LastDigit);
            n = n / 10;
        }
        if(sum == duplicate)
        {
            System.out.println("This is Armstrong Number");
        }
        else
        {
            System.out.println("This is not Armstrong Number");
        }
    }
}
