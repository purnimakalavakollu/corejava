abstract class Bank
{
    abstract void irate();
}
class HDFC extends Bank
{
    void irate()
    {
        System.out.println("Interst rate of HDFC bank is 5%");
    }
}
class SBI extends Bank
{
    void irate()
    {
        System.out.println("Interst rate of SBI bank is 9%");
    }
}
class ICICI extends Bank
{
    void irate()
    {
        System.out.println("Interst rate of ICICI  bank is 15%");
    }
}
class Main
{
    public static void main(String args[])
{
    HDFC h=new HDFC();
    SBI s=new SBI();
    ICICI i=new ICICI();
h.irate();
s.irate();
i.irate();
}
}