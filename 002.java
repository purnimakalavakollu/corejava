import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader I=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(I);
        int age;
        System.out.print("Enter your age..:");
        age= Integer.parseInt(br.readLine());
        System.out.println("age="+age);
        }
    }
