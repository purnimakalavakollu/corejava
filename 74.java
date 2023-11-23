class MyCalci {
    int a;
    int b;
    int c;

    MyCalci() {
        a = 1;
        b = 2;
        c = 3;
    }

    int mySumOne() {
        return a + b + c;
    }

    MyCalci(int x, int y) {
        a = x;
        b = y;
        c = 0; // Default value for c
    }

    int mySumTwo() {
        return a + b;
    }

    MyCalci(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    int mySumThree() {
        return a + b + c;
    }
}

class Main {
    public static void main(String args[]) {
        MyCalci MC1 = new MyCalci();
        MyCalci MC2 = new MyCalci(10, 20);
        MyCalci MC3 = new MyCalci(10, 20, 30);

        System.out.println("sum=" + MC1.mySumOne());
        System.out.println("sum=" + MC2.mySumTwo());
        System.out.println("sum=" + MC3.mySumThree());
}
}