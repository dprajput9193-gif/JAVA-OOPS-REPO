class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something...");
    }
    public void printcolor(){
        System.out.println(this.color);  // -> this function ko batat h ki kis object ne call kiya h.
    }
    public void printtype(){
        System.out.println(this.type);
    }
}

public class OopsStrt {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "p1 color is Red ";
        p1.type = "p1 is Gel pen ";
        System.out.print("p1 is ");
        p1.write();
        
        Pen p2 = new Pen();
        p2.color = "p2 color is Black ";
        p2.type = "p2 is Ball pen ";
        
        p1.printcolor();
        p2.printcolor();
        p1.printtype();
        p2.printtype();
           p2.write();
    }
}