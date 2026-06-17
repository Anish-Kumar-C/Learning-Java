import java.util.Scanner;
import java.util.Random;
public class Number_Guess
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int num = ran.nextInt(101);
        int num_user = 0;
        int attempts = 0;
        System.out.println("A random number has been chosen between 1 and 2");
        System.out.println("Try guessing the number");
        System.out.println("The score is graded by 100 and it depends on number of attempts used by the user to guess the number");
        while(num != num_user)
        {
            System.out.print("Enter your guess : ");
            num_user = sc.nextInt();
            
            if(num_user < num)
            {
                System.out.println("The number guessed is too LOW");
                System.out.println("Try again");
                attempts++;
            }
            else if(num_user > num)
            {
                System.out.println("The number guessed is too HIGH");
                System.out.println("Try again");
                attempts++;
            }
            else
            {
                System.out.println("CONGRATULATIONS");
                System.out.println("You have guessed the correct number which is : " +num);
                System.out.println("Total number of attempts used is : " +attempts);
                int Score = 100 - attempts;
                System.out.println("Score obtained : " +Score);
            }
        }
    }
}
