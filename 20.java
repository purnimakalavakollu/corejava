import java.lang.*;
class Main
{
    public static void main(String args[])
    {
        int i=1,c=0,s=0,ce=0,se=0,co=0,so=0;
        double ave,ave,avo;
        while(i<=10)
        {
            System.out.print(i+"\t");
            c=c+1;
            s=s+i;

         if(i%2==0)
        {
            ce=ce+1;
            se=se+i;
        }
          else if(i%2!=0)
        {
            co=co+1;
            so=so+i;
        }
         i=i+1;
        }
          av=s/10;
         ave=se/10;
         avo=so/10;
        System.out.print("");
        System.out.println("------------");
        System.out.println("sum="+s);
        System.out.println("count="+c);
        System.out.println("average="+av);
        System.out.println("------------");
        System.out.println("sum="+se);
        System.out.println("count="+ce);
        System.out.println("average="+ave);        
        System.out.println("------------");
        System.out.println("sum="+so);
        System.out.println("count="+co);
        System.out.println("average="+avo);
}
}

         