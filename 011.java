import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])
    {
      int eno;
      String ename;
      double esal;
      float epf;
      char egrade;
         System.out.print("Enter Eno..:");
        eno=SC.nextInt();
        System.out.print("Enter Ename..:");
        ename= SC.next();
        System.out.print("Enter Esal..:");
        esal=SC.nextDouble();
       System.out.print("Enter EPF..:");
        epf=SC.nextFloat();
        System.out.print("Enter Egrade..:");
        egrade=SC.next().Char At(0);
        System.out.println("-------------");
        System.out.println("\t EMPLOYEE DATA");
        System.out.println("-------------");
        System.out.println("Number"+eno);
        System.out.println("Name"+ename);
        System.out.println("Salary"+esal);
        System.out.println("epf"+epf);
        System.out.println("Grade+"+egrade);
        System.out.println("-------------");
        }
}

