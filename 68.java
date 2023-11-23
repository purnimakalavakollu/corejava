class Icecream
{
    int price;
    int quantity;
    int billAmt()
{
    return price*quantity;
}
}
class Main
{
    public static void main(String args[])
    {
        Icecream vanilla=new Icecream();
        vanilla.price=20;
        vanilla.quantity=25;
        System.out.println("price of vanilla="+vanilla.price);
        System.out.println("quantity of vanilla="+vanilla.quantity);
        System.out.println("Amount of vanilla="+vanilla.billAmt());
}
}