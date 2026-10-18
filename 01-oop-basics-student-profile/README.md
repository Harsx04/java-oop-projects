# OOP Basics — Student Profile

My first Java OOP project. It creates two Student objects and displays their individual names and ages.

## Concepts Covered

- **Class:** `Student` defines the fields and behaviour of a student.
- **Objects:** two separate instances hold different student details.
- **Fields:** `name` and `age` store each object's data.
- **References:** `student1` and `student2` refer to their respective objects.
- **Instance method:** `displayDetails()` displays the data of the object it is called on.
- **Constructor:** initialises each student with a name and age.
- **`this`:** distinguishes the current object's fields from constructor parameters.

Detailed explanations are available in [NOTES.md](NOTES.md).

## Files

- `src/Main.java` — creates the students and calls their methods.
- `src/Student.java` — defines the fields, constructor, and display method.

## How to Run

With a JDK installed, open a terminal in this project's folder:

```text
javac src/Main.java src/Student.java
java -cp src Main
```

Alternatively, open the project in IntelliJ IDEA and run `Main.main()`.

## Expected Output

```text
Name: Harsh
Age: 21
Name: Priya
Age: 22
```

## Status

Complete. The project meets its planned scope: creating two students using a constructor and displaying their separate data through an instance method.