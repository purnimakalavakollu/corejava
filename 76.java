class Bird
{
    static int count=100;
    int age;
    int wings;
    double weight;
    String color;
    static void buildnest()
    {
        System.out.println("They want nest to live");
    }
    void fly()
        {
            System.out.println("They want full fil their natural actuvities");
            }
    }
class Main
{
    public static void main(String args[])
    {
        System.out.println("count of Bird="+Bird.count);
        Bird.buildnest();
        System.out.println("====================");
        Bird Pigeon=new Bird();
        Pigeon.age=5;
        Pigeon.wings=2;
        Pigeon.weight=2.5;
        Pigeon.color="Grey";
    System.out.println("Age of Pigeon="+Pigeon.age);
    System.out.println("wings of Pigeon="+Pigeon.wings);
    System.out.println("weight of Pigeon="+Pigeon.weight);
    System.out.println("color of Pigeon="+Pigeon.color);
    Pigeon.fly();
    }
}

    
