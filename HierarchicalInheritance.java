// THIS IS CALLED HIERARCHICAL INHERITANCE.
class shape {
    public void area() {
        System.out.println("Displays area..");
    }
}

class Triangle extends shape {
    public void area(int l, int b) {
        System.out.println((l * b) / 2);
    }
}

class circle extends shape {
    public void area(int r) {
        System.out.println(3.14 * (r * r)); // isse answer double me hi aayega int dene k baad bhi quki
    } // int automatic badi value double me convert ho jayega. bY (implicit type
      // casting).
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        circle c = new circle();
        c.area();
        c.area(6);
    }
}
