import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int a,b,c,i;
        Scanner SC=new Scanner(System.in);
        System.out.println("----------");
        System.out.println("\tMENU");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Divison");
        System.out.println("Modulus");
        System.out.println("----------");
        System.out.println("Enter your choice 1/2/3/4/5");
        i=SC.nextInt();
        System.out.println("Enter a value..:");
        a=SC.nextInt();
        System.out.println("Enter b value..:");
        b=SC.nextInt();
        switch(i)
        {
            case 1:
                c=a+b;
                System.out.println("sum="+c);
                break;
                
                case 2:
                    c=a-b;
                System.out.println("Subtraction="+c);
                break;
                
            case 3:
                c=a*b;
                System.out.println("Multiplication="+c);
                break;
                
            case 4:
                c=a/b;
                System.out.println("Divison="+c);
                break;
                
            case 5:
                c=a%b;
                System.out.println("Modulus="+c);
                break;
                
               default:
                System.out.println("Invalid option selected");
        }
    }
}



    