// Reverse multiplication table for given number
import java.util.Scanner;
public class Reverse_Multiplication
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.print("Enter the number for multiplication : ");
      n = sc.nextInt();
      for(int i = 10 ; i > 0 ; i--)
        {
          int p = n*i;
          System.out.println(n+ "x" +i+ "=" +p);
        }
    }
  }
