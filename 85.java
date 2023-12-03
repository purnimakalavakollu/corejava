import java.lang.*;
class Main
{
    public static void main(String args[])
    {
    try{
     int a=100,b=0,c;
     System.out.println("Begin");
     System.out.println("Ready to do divison");
     c=a/b;
     System.out.println("Result="+c);
     System.out.println("Exceution success");
     System.out.println("End");
    } 
    catch (ArithmeticException ex) 
{
    System.out.println("You cannot Divide a Number with zero");
}
}
}