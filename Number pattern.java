import java.util.*;
public class NumberPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines of the pattern");
        int n = sc.nextInt();
        int i;
        for(i=1; i <= n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
