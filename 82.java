class Person
{
    void walk()
    {
        System.out.println("Person walks slowly");
    }
}
class Employee extends Person
{
    void walk()
    {
        System.out.println("Person walks speedly");
    }
}
class Main
{
    public static void main(String args[])
    {
        Employee E=new Employee();
        E.walk();
    }
}