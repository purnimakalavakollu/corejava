import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int i=2;
        ;
        System.out.println("--------------");
        System.out.println("\tMENU");
        System.out.println("--------------");
        System.out.println("1.LOWSPEED");
        System.out.println("2.MEDIUMSPEED");
        System.out.println("3.HIGHSPEED");
        System.out.println("--------------");
    switch(i)
    { 
       
        case 1:
        System.out.println("LOWSPEEDSELECTED");
        break;
        
        case 2:
        System.out.println("MEDIUMSPEEDSELECTED");
        break;
        
        case 3:
        System.out.println("HIGHSPEEDSELECTED");
        break;
         default:
        System.out.println("Invalid option selected");
    }
    }
}