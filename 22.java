import java.lang.*;
class Main
{
    public static void main(String args[])
    {
        int i=1;
        while(i<=20)
        {
        if(i%15==0)
        {
            System.out.print("FizzBuzz");
        }
         else if(i%3==0)
        {
        System.out.println("Fizz");
    }
    else if (i%5==0)
    {
     System.out.println("Buzz");
   }
   else
   {
       System.out.println(i);
   }
   i=i+1;
        }
    }
}