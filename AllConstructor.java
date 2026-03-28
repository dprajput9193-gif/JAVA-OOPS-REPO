class Student {
  int id;
  String name;

  // Default Constructor.
  public Student() {
    id = 0;
    name = null;
  }

  // --> Parameterized Constructor.
  public Student(int i, String n) {
    id = i;
    name = n;
  }

  // Copy Constructor.
  public Student(Student s) {
    id = s.id;
    name = s.name;
  }

  public void display() {
    System.out.println(id + " " + name);
  }
}

public class AllConstructor {
  public static void main(String[] args) {
    Student s1 = new Student();  // For Default.
    s1.display();
    Student s2 = new Student(101, "Deepanshu");   // For  parameterized Constructor.
    s2.display();
    Student s3 = new Student(102, "Krishna");  // For Parameterized.
    s3.display();
    Student s4 = new Student(s3);  // For Copy Constructor.
    s4.display();
  }
}
