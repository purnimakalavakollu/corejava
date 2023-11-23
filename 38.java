import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int a,b,c;
        char i;
        Scanner SC=new Scanner(System.in);
        System.out.println("----------");
        System.out.println("\tMENU");
        System.out.println("----------");
        System.out.println("+Addition");
        System.out.println("-Subtraction");
        System.out.println("*Multiplication");
        System.out.println("/Divison");
        System.out.println("%Modulus");
        System.out.println("----------");
        System.out.println("Enter your choice +/-/*///%");
        i=SC.next().charAt(0);
        System.out.println("Enter a value..:");
        a=SC.nextInt();
        System.out.println("Enter b value..:");
        b=SC.nextInt();
        switch(i)
        {
            case '+':
                 c=a+b;
                System.out.println("sum="+c);
                break;
                
                case '-':
                      c=a-b;
                System.out.println("Subtraction="+c);
                break;
                
            case '*':
                   c=a*b;
                System.out.println("Multiplication="+c);
                break;
                
            case '/':
                   c=a/b;
                System.out.println("Divison="+c);
                break;
                
            case '%': 
                 c=a%b;
                System.out.println("Modulus="+c);
                break;
                
               default:
                System.out.println("Invalid option selected");
        }
    }
}



    