import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
{
    int x;
    Scanner SC=new Scanner(System.in);
    System.out.print("Enter year..:");
    x=SC.nextInt();
    if(x%2==0)
    {
        System.out.println("even");
    }
    else
    {
        System.out.println("odd");
    }
    }
}
