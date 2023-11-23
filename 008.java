import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int eno;
      String ename;
      double esal;
      float epf;
      char egrade;
         System.out.print("Enter Eno..:");
        eno= Integer.parseInt(br.readLine());
        System.out.print("Enter Ename..:");
        ename= br.readLine();
        System.out.print("Enter Esal..:");
        esal= Double.parseDouble(br.readLine());
       System.out.print("Enter EPF..:");
        epf= Float.parseFloat(br.readLine());
        System.out.print("Enter Egrade..:");
        egrade=(char)br.read();
        System.out.println("-------------");
        System.out.println("\t EMPLOYEE DATA");
        System.out.println("-------------");
        System.out.println("Number="+eno);
        System.out.println("Name+"+ename);
        System.out.println("Salary+"+esal);
        System.out.println("Provident Fund+"+epf);
        System.out.println("Grade=+"+egrade);
        System.out.println("-------------");
        }
}

