public class Student {
    String name;
    int age;

    // Initialise each new student with the supplied name and age.
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
