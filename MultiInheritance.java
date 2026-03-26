// THIS IS CALLED MULTI INHERITANCE.
class me {
    public void eace() {                // agar ise print karana h to method ko alag tarike se likhna padega.
        System.out.println("I love her..");     // kuch bhi(thoda) alag karna padega.
    }
}

class she extends me {
    public void peace(int a, int b, int c) {
        System.out.println("she loves me..");
    }
}

class us extends she {
    public void peace() {
        System.out.println("But i am Joe goldberg ");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        us x = new us();
        x.eace();
        x.peace(1, 4, 3);
        x.peace();
    }
}
