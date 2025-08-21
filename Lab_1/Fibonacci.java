import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int n=input.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++)
        {
            int c=a + b;
            a=b;
            b=c;
            System.out.println(c);
        }
        input.close();
    }
}
