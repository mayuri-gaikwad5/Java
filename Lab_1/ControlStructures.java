import java.util.Scanner;
public class ControlStructures{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer number ");
        int num=input.nextInt();
        System.out.println("Number : "+num);
        input.close();
        if(num%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
        
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                break;
                }
             }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
        
        
        switch (num)
        {
            case 1:
                System.out.println("Weekday : Monday");
                break;
            case 2:
                System.out.println("Weekday : Tuesday");
                break;
            case 3:
                System.out.println("Weekday : Wednesday");
                break;
            case 4:
                System.out.println("Weekday : Thursday");
                break;
            case 5:
                System.out.println("Weekday : Friday");
                break;
            case 6:
                System.out.println("Weekday : Saturday");
                break;
            case 7:
                System.out.println("Weekday : Sunday");
                break;
            default:
                System.out.println("The number excceds the 7 days");
        }
        
    }
}


