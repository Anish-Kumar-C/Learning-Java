import java.util.Scanner;
public class Mini_Calculator
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("HELLO USER !");
      System.out.println("CHOICES AVAILABLE : ");
      System.out.println("Enter '1' for addition");
      System.out.println("Enter '2' for subtraction");
      System.out.println("Enter '3' for multiplication");
      System.out.println("Enter '4' for division");
      System.out.print("Enter your choice : ");
      int n = sc.nextInt();
      System.out.print("Enter first number : ");
      double a = sc.nextDouble();
      System.out.print("Enter second number : ");
      double b = sc.nextDouble();
      double c;
      switch(n)
        {
          case 1 :
            c = a+b;
            System.out.println("The sum of the nummbers is : " +c);
            break;
          case 2 : 
            c = a-b;
            System.out.println("The difference of the numbers is : " +c);
            break;
          case 3 : 
            c = a*b;
            System.out.println("The product of the numbers is : " +c);
            break;
          case 4 : 
            c = a/b;
            System.out.println("The quotient of the numbers is : " +c);
            break;
          default : 
            System.out.println("WRONG CHOICE !!");
            System.out.println("CHOOSE AGAIN");
            break;
        }
      }
  }
