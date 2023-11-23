import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) {
        String str1 = "rocket";
        String str2 = "SHAR";
        String str3 = "liril";

        System.out.println("string1=" + str1);
        System.out.println("string2=" + str2);
        System.out.println("length of s1=" + str1.length());
        System.out.println("uppercase=" + str1.toUpperCase());
        System.out.println("lowercase=" + str1.toLowerCase());
        System.out.println("char at index 2=" + str1.charAt(2));
        System.out.println("replace=" + str3.replace('i', 'x'));
        System.out.println("index=" + str1.indexOf('c'));
        System.out.println("substring=" + str1.substring(0,3));
}
}