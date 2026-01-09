package Know_Basic_Maths;

import java.util.Scanner;

public class Prime_Number
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();
       int count = 0;
//       for(int i = 1 ; i <= n ; i++)
//       {
//           if(n % i == 0)
//           {
//               count++;
//           }
//       }
       for(int i = 1 ; i*i <= n ; i++)
       {
           if(n %i ==0) {
               count++;
               if ((n / i) != i) {
                   count++;
               }
           }
       }
       if(count == 2)
       {
           System.out.println("Prime Number");
       }
       else
       {
           System.out.println("Not Prime Number");
       }
    }
}
