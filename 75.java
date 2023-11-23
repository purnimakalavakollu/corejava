class Bookas {
    int bookNumber;
    String bookName;
    double bookPrice;

    Bookas() {
        bookNumber = 1;
        bookName = "UNIX";
        bookPrice = 455.75;
    }

    void displayBookDetails() {
        System.out.println("Book Number: " + bookNumber);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: " + bookPrice);
    }

    Bookas(int bn, String bna) 
    {
        bookNumber = bn;
        bookName = bna;
        bookPrice = 0; // Default value for price
    }

    void displayBookNumberAndName() 
    {
        System.out.println("Book Number: " + bookNumber);
        System.out.println("Book Name: " + bookName);
    }

    Bookas(int bn, String bna, double bp)
    {
        bookNumber = bn;
        bookName = bna;
        bookPrice = bp;
    }

    void displayBookAllDetails() 
    {
        System.out.println("Book Number: " + bookNumber);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: " + bookPrice);
    }
}

class Main {
    public static void main(String args[])
    {
        Bookas B1 = new Bookas();
        Bookas B2 = new Bookas(102, "Python");
        Bookas B3 = new Bookas(103, "Windows", 456.75);

        B1.displayBookDetails();
        B2.displayBookNumberAndName();
        B3.displayBookAllDetails();
    }
}