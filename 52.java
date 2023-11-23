import java.lang.*;
import java.util.*;
class Main
    {
        public static void main(String args[])
        {
            int a[][]={{1,2,3},{4,5,6,},{7,8,9}};
            int b[][]={{1,2,3},{4,5,6,},{7,8,9}};
            int c[][]=new int[3][3];
            int i,j;
            System.out.println("A Matrix..:");
            System.out.println("-------");
            for(i=0;i<3;i++)
            {
            for(j=0;j<3;j++)
            System.out.print("\t"+a[i][j]);
            System.out.println();
            }
            System.out.println("B Matrix..");
            System.out.println("-------");
               for(i=0;i<3;i++)
            {
            for(j=0;j<3;j++)
            System.out.print("\t"+b[i][j]);
            System.out.println();
            }
            System.out.println("A+B Matrix..:");
            System.out.println("-------");
            for(i=0;i<3;i++)
            {
            for(j=0;j<3;j++)
            {
            c[i][j]=a[i][j]+b[i][j];
            System.out.print("\t"+c[i][j]);
            }
            System.out.println();
            }
}
}
