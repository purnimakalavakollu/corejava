import java.lang.*;
class Main
{
    public static void main(String args[])
    {
        int i=5;
        while(i>=2)
         {
             System.out.println(i+"bottles of the beer on the wall,"+i+"bottles of beer.");
            System.out.println("Take one down and pass it around,"+(i-1)+"bottles of beer on the wall.\n");
            i=i-1;
         }
         if(i==1)
         System.out.println("1 bottle of beer on the wall,1 bottle of beer.");
         System.out.println("Take one down and pass it around,no more bottles of beer on the wall.\n");
         System.out.println("No more bottles of beer on the wall no more bottles of beer.");
         System.out.println("Go to the store and buy some more,99 bottles of beer on the wall.");
 }
    }
