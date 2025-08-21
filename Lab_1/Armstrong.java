import java.util.Scanner;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int n=input.nextInt();
        System.out.println("Is Armstrong number: "+ isArmstrong(n));
        input.close();
    }
    static boolean isArmstrong(int n)
    {
        int digits=0,temp;
        temp=n;
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        System.out.println("Number of digits: "+digits);
        temp=n;
        int sum=0;
        while(temp>0)
        {
            int lastDigit = temp%10;
            sum=(int)(sum+Math.pow(lastDigit,digits));
            temp=temp/10;
        }
        System.out.println("sum of digits: "+sum);
        if(sum==n)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
}
