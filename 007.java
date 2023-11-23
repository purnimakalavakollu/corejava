import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int sno;
      String bcode;
      String bname;
      float bprice;
      boolean bav;
      char bpcode;
         System.out.print("Enter serial number..:");
        sno= Integer.parseInt(br.readLine());
         System.out.print("Enter Book code..:");
        bcode=br.readLine();
        System.out.print("Enter Book name..:");
        bname= br.readLine();
        System.out.print("Enter Book price..:");
        bprice= Float.parseFloat(br.readLine());
       System.out.print("Enter Book Availability..:");
        bav= Boolean.parseBoolean(br.readLine());
        System.out.print("Enter price code..:");
        bpcode=(char)br.read();
        System.out.println("-------------");
        System.out.println("\t BOOK DETAILS");
        System.out.println("-------------");
        System.out.println("serial number="+sno);
        System.out.println("Book code+"+bcode);
        System.out.println("Book name+"+bname);
        System.out.println("Book price+"+bprice);
        System.out.println("Book availability+"+bav);
        System.out.println("Book  print code+"+bpcode);
        System.out.println("-------------");
        }
}

