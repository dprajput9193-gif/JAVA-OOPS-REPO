class Studentinfo {
    String name;
    String age;
    String passion;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.passion);
    }
}

public class Student {
    public static void main(String[] args) {
        Studentinfo s1 = new Studentinfo();
        s1.name = "Deepanshu pundir ";
        s1.age = "17 years";
        s1.passion = "Be a successful person ";

        Studentinfo s2 = new Studentinfo();
        s2.name = "Joe goldberg ";
        s2.age = "30 years ";
        s2.passion = "Stalker ";

        s1.printinfo();
        s2.printinfo();

    }
}
