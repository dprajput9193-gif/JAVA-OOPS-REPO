// THIS IS CALLED SINGLE LEVEL INHERITANCE.
// bas do classes.. base class ---> derived class.
class shape {
    public void area() {
        System.out.println("Displays area...");
    }
}

class print extends shape { // --> shape class ko print class k andar daal diya.
    public void area(int l, int b) {
        System.out.println((l * b) / 2);
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        print p1 = new print();
        p1.area();
        p1.area(7, 2);
    }
}
