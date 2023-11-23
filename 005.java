import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader I=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(I);
        int l,b,a;
        System.out.print("Enter length..:");
        l= Integer.parseInt(br.readLine());
        System.out.print("Enter breadth..:");
        b= Integer.parseInt(br.readLine());
        a=l*b;
        System.out.println("Area="+a);
    }
}

