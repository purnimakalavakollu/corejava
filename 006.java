import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader I=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(I);
        int r;
        double ci,a;
        System.out.print("Enter radius..:");
        r= Integer.parseInt(br.readLine());
        ci=2*Math.PI*r;
        System.out.print("circumference of circle="+ci);
        a=Math.PI*r*r;
        System.out.println("Area of circle="+a);
    }
}

