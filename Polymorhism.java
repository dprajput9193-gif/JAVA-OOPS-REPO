// hamne ek hi type printInfo name ka function banaya h jiska use alag alag tarike se kiya h. ise ji
// polymorphism kehte h.

class Student{
    String name;
    int age;
public void printinfo(String name){
System.out.println(name);
}
public void printinfo(int age){
    System.out.println(age);
}
public void printinfo(String name, int age){
    System.out.println(name + " " + age);
}
}
public class Polymorhism {
      public static void main(String[] args){
    Student s1 = new Student();
    s1.name = "Deepanshu";
    s1.age = 17;
    Student s2 = new Student();
    s2.name = "Khushi";
    s2.age = 17;

    s1.printinfo(s1.name, s1.age);
s2.printinfo(s2.name, s2.age);
}
}