import java.lang.*;
class Icecream
{
    int price;
    int quantity;
    int weight;
    String color;
     void melt()
    {
        System.out.println("It melts at room temperature");
    }
    int billAmt()
    {
        return price*quantity;
    }
}
class Main
{
    public static void main (String args[])
    {
        Icecream vanilla=new Icecream();
        vanilla.price=20;
        vanilla.quantity=200;
        vanilla.weight=25;
        vanilla.color="white";
        System.out.println("price of vanilla="+vanilla.price);        
        System.out.println("quantity of vanilla="+vanilla.quantity);
        System.out.println("weight of vanilla="+vanilla.weight);
        System.out.println("color of vanilla="+vanilla.color);
        vanilla.melt();
        System.out.println("====================================");
        Icecream strawberry=new Icecream();
         strawberry.price=20;
        strawberry.quantity=200;
         strawberry.weight=45;
        strawberry.color="pink";
       System.out.println("price of strawberry="+strawberry.price);        
        System.out.println("quantity of strawberry="+strawberry.quantity);
        System.out.println("weight of strawberry="+strawberry.weight);
        System.out.println("color of strawberry="+strawberry.color);
        strawberry.melt();
}
}