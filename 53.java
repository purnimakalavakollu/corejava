import java.lang.*;
import java.util.*;
class Main
    {
        public static void main(String args[])
        {
            int a[][]=new int[100][100];
            int b[][]=new int[100][100];
            
            int i,j,c,r;
            Scanner SC=new Scanner(System.in);
            System.out.print("Enter no of rows for A matrix..:");
            r=SC.nextInt();
            System.out.print("Enter no of columns for A matrix..:");
            c=SC.nextInt();
            for (i=0;i<3;i++)
            {
             for (j=0;j<3;j++)
             a[i][j]=SC.nextInt();
            }
             System.out.print("Enter no of rows for B matrix..:");
             r=SC.nextInt();
             System.out.print("Enter no of columns for B matrix..:");
             c=SC.nextInt();
             for(i=0;i<3;i++);
             {
            for(j=0;j<3;j++);
            b[i][j]=SC.nextInt();
             }
             System.out.print("Enter A Matrix");
             System.out.println("-------");
             for(i=0;i<r;i++);
             {
            for(j=0;j<r;j++);
            System.out.println("\t"+a[i][j]);
            System.out.println();
             }
            System.out.print("Enter B Matrix");
             System.out.println("-------");
             for(i=0;i<r;i++);
             {
            for(j=0;j<3;j++);
            System.out.println("\t"+b[i][j]);
            System.out.println();
             }
            System.out.print("Enter A+B Matrix");
             System.out.println("-------");
             for(i=0;i<r;i++);
             {
            for(j=0;j<r;j++);
            System.out.println("\t"+a[i][j]+b[i][j]);
            System.out.println();
}
}
}