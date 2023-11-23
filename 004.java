import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader I=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(I);
        int a,b;
        System.out.print("Enter a..:");
        a= Integer.parseInt(br.readLine());
        System.out.print("Enter b..:");
        b= Integer.parseInt(br.readLine());
        System.out.println("Addition="+(a+b));
        System.out.println("Subtraction="+(a-b));
        System.out.println("Multiplication="+(a*b));
        System.out.println("Division="+(a/b));
        System.out.println("Modulus="+(a%b));
    }
}

