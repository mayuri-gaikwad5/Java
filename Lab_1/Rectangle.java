public class Rectangle
{
    int length;
    int width;
    
    Rectangle()
    {
        this.length=1;
        this.width=1;
    }
    Rectangle(int n)
    {
        this.length=n;
        this.width=n;
    }
    Rectangle(int x,int y)
    {
        this.length=x;
        this.width=y;
    }
    
    void displayArea()
    {
         System.out.println("Area = "+ length*width);
    }
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        System.out.println("Area  of Rectangle with no parameter ");
        r.displayArea();
        Rectangle r1 = new Rectangle(5);
        System.out.println("\n Area  of Rectangle with one parameter ");
        r1.displayArea();
        Rectangle r2 = new Rectangle(3,5);
        System.out.println("\n Area  of Rectangle with two  parameter ");
        r2.displayArea();
        
    }
}