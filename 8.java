import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int year;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter year..:");
        year=SC.nextInt();
        if (year%400==0&&year%100!=0||year%4==0)
        {
            System.out.println("Leap year,,:");
        }
        else
        {
            System.out.println(" not aLeap year,,:");
     
        }
        }
}