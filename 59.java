import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) {
        String str1 = "APPLE";
        String str2 = "Ankle";
        String str3 = "apple";
        String str4 = "ANKLE";
       System.out.println(str1.equals(str2));
       System.out.println(str1.equals(str3));
       System.out.println(str1.equals(str4));
       System.out.println(str1.equalsIgnoreCase(str3));
    }
}