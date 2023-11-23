import java.lang.*;
import java.util.*;
class Main {
    public static void main(String args[]) {
        String s = "State bank of india";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}