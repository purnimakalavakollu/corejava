import java.lang.*;
import java.util.*;
class Main
{
  public static void main (String args[])
  {
    Scanner SC=new Scanner (System.in);
    int sno, sclass, m1, m2, m3, m4, m5, m6, tot;
    String sname;
    char ssec;
    double avg;
    System.out.print ("Enter Sno..:");
    sno = SC.nextInt();
    System.out.print ("Enter Sname..:");
    sname =SC.next();
    System.out.print ("Enter Sclass..:");
    sclass= SC.nextInt();
    System.out.print ("Enter Ssec..:");
    ssec=SC.next().charAt (0);
    System.out.print("Enter M1..:");
    m1=SC.nextInt();
    System.out.print("Enter M2..:");
    m2=SC.nextInt();
    System.out.print("Enter M3..:");
    m3=SC.nextInt();
    System.out.print("Enter M4..:");
    m4=SC.nextInt();
    System.out.print("Enter M5..:");
    m5=SC.nextInt();
    System.out.print("Enter M6..:");
    m6=SC.nextInt();
    tot=m1+m2+m3+m4+m5+m6;
    avg = tot / 6;
    System.out.println("-------------");
    System.out.println("MARKS REPORT");
    System.out.println("-------------");
    System.out.println("Sno="+sno+"\t"+"Sname="+sname);
    System.out.println("Sclass="+sclass+"\t"+"Ssec="+ssec);
    System.out.println("*******************");
    System.out.println("m1="+m1+"\t"+"m2="+m2);
    System.out.println("m3="+m3+"\t"+"m4="+m4);
    System.out.println("m5="+m5+"\t"+"m6="+m6);
    System.out.println("*******************");
    System.out.println("total="+tot);
    System.out.println("average="+avg);
    System.out.println("*******************");
    if(m1<35||m2<35||m3<35|| m4<35|| m5<35|| m6<35)
    {
        System.out.println("Result=Fail");
        System.out.println("GRADE=NO GRADE");
    }
    else if(avg>=65)
    {
         System.out.println("Result=pass");
        System.out.println("GRADE=A");
    }
    else if(avg<65&&avg>=45)
    {
         System.out.println("Result=pass");
        System.out.println("GRADE=B");
    }
        else if(avg<45)
    {
         System.out.println("Result=pass");
        System.out.println("GRADE=b");
    }
  }
  }


    
    






