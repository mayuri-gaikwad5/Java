import java.util.Scanner;
public class MinMaxAvg
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=input.nextInt();
        int a[]= new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum Element in array is "+max);
        
        int min=a[0];
        for (int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Minimum Element in array is "+min);
        
        int sum=0,count=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            count++;
        }
        int average = sum/count;
        System.out.println("Average of all the elements is: "+average);
        input.close();
    }
}
