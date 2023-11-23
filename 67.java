import java.lang.*;
class Bird
{
    int age;
    int wings;
    double weight;
    String color;
    void fly()
    {
        System.out.println("They want to fullfill their natural activities");
    }
    void buildNest()
    {
        System.out.println("They build nest to live");
    }
}
class Main
{
    public static void main(String args[])
    {
        Bird parrot=new Bird();
        parrot.age=5;
        parrot.wings=2;
        parrot.weight=2.5;
        parrot.color="Green";
        System.out.println("age of parrot="+parrot.age);
        System.out.println("wings of parrot="+parrot.wings);
        System.out.println("weight of parrot="+parrot.weight);
        System.out.println("color of parrot="+parrot.color);
        parrot.fly();
        parrot.buildNest();
     System.out.println("--------------------");
     System.out.println("--------------------");
        Bird pigeon=new Bird();
        pigeon.age=7;
        pigeon.wings=2;
        pigeon.weight=4.5;
        pigeon.color="grey";
        System.out.println("age of pigeon="+pigeon.age);
        System.out.println("wings of pigeon="+pigeon.wings);
        System.out.println("weight of pigeon="+pigeon.weight);
        System.out.println("color of pigeon="+pigeon.color);
        pigeon.fly();
        pigeon.buildNest();
     System.out.println("--------------------");
     System.out.println("--------------------");
}
}
