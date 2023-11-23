import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader I=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(I);
        String name;
        System.out.print("Enter your name..:");
        name=br.readLine();
        System.out.println("Name="+name);
        }
    }
