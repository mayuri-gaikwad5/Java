import java.util.Scanner;
public class TransposeMatrix
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter number of rows: ");
        int rows= input.nextInt();
        
        System.out.println("please enter number of Columns: ");
        int cols= input.nextInt();
        
        int Matrix[][]= new int[rows][cols];
        int transpose[][]=new int[cols][rows];
        
        System.out.println("Enter the data for the matrix: ");
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                Matrix[i][j]=input.nextInt();
            }
        }
        
        System.out.println("Print the input matrix: ");
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Create the Transpose matrix: ");
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                transpose[j][i]=Matrix[i][j];
            }
        }
       
        System.out.println("Print the transposed matrix: ");
         
        for (int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
       input.close();
       
    }
}
