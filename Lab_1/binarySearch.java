import java.util.Arrays;
public class binarySearch
{
    public static void main(String[] args)
    {
        int a[]={12,23,41,62,71,78,81,90,92};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        int mid, low=0, high=a.length-1;
        int key=12;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==key)
            {
                System.out.println("Element found at place : "+mid);
                break;
            }
            
            else if(a[mid]>key)
            {
                
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if(low>high)
        {
            System.out.println("Element is not present ");
        }
        
    }
}
