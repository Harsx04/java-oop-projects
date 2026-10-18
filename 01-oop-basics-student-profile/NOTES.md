# Student Profile — Learning Notes

## 1. What Is a Class?

A class defines a type, including the data it holds (fields) and the actions it can perform (methods).

```java
public class Student {
    String name;
    int age;
}
```

Our `Student` class defines two instance fields:
- `name`, a `String` that stores text.
- `age`, an `int` that stores a whole number.

Defining the class does not create an individual Student object.

## 2. What Is an Object?

An object is an instance of a class created while the program runs.

Each Student object has its own values for `name` and `age`.

```java
Student student1 = new Student();
```

### Understanding This Line

| Part | Meaning |
|---|---|
| `Student` | The variable's type |
| `student1` | The variable that refers to the object |
| `new Student()` | Creates a Student object |
| `=` | Assigns the reference to `student1` |

`student1` is a **reference variable**. It stores a reference to the object, rather than containing the object itself.

## 3. Accessing an Object's Fields

Use the dot operator (`.`) to access fields through an object's reference.

```java
student1.name = "Harsh";
student1.age = 21;
```

These statements assign values to the fields of the object referenced by `student1`.

```java
System.out.println(student1.name);
System.out.println(student1.age);
```

These statements read and print those values.

## 4. Creating Two Separate Objects

```java
Student student1 = new Student();
student1.name = "Harsh";
student1.age = 21;

Student student2 = new Student();
student2.name = "Priya";
student2.age = 22;
```

There is one class definition, but two separate objects.

Each object has its own instance field values. Changing `student2.age` does not change `student1.age`.

The names and ages are example data.

## 5. Why Use Classes and Objects?

Classes group related data and behaviour into meaningful types.

Without a Student class, we might manage separate variables:

```java
String student1Name = "Harsh";
int student1Age = 21;

String student2Name = "Priya";
int student2Age = 22;
```

With a Student class, each student's related data belongs to an individual object. We can reuse the same class definition to create different students.

Later, we will add methods that work with each student's data.

## 6. An Object I Have Already Used

```java
Scanner input = new Scanner(System.in);
```

- `Scanner` is a class provided by Java.
- `new Scanner(System.in)` creates a Scanner object that reads standard input.
- `input` is the reference variable used to access that object.

Creating a Student object follows the same general pattern.

## 7. Naming Conventions

- Class names begin with a capital letter: `Student`.
- Variable names begin with a lowercase letter: `student1`.
- A public class named `Student` belongs in `Student.java`.

## 8. Program Entry Point

Our program starts in:

```java
public static void main(String[] args)
```

For this project:
- `Main.java` contains the entry point and creates the students.
- `Student.java` defines the Student type.
- Run `Main.java` to execute the program.

## Methods

A method is a named block of code that performs a task. We define its instructions once and call it when needed.

Methods can receive input through **parameters** and send a result back using **return**.

### Our Instance Method

```java
public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
```

| Part | Meaning |
|---|---|
| `public` | Allows the method to be accessed from other classes |
| `void` | The method does not return a value |
| `displayDetails` | The method name |
| `()` | An empty parameter list; no arguments are required |
| `{ ... }` | The method body: instructions executed when called |

This is an **instance method** because it is not declared `static`. It works with an individual object's data.

### Calling the Method

```java
student1.displayDetails();
student2.displayDetails();
```

The first call displays the fields of the object referenced by `student1`. The second displays those of the object referenced by `student2`.

The method needs no parameters because it reads the object's existing fields.

### Parameters, Arguments, and Return Values

Using an example from the calculator project:

```java
public static double add(double a, double b) {
    return a + b;
}
```

```java
double result = add(10, 5);
```

- **Parameters:** `a` and `b`, declared in the method definition.
- **Arguments:** `10` and `5`, supplied in the call.
- **Return type:** `double`, the type of value the method sends back.
- **Return statement:** `return a + b;`, which sends the result back to the caller.

A `void` method can print output without returning a value. Printing and returning are different actions.

### Instance Methods and Static Methods

- An **instance method** is called on an object and can directly access that object's instance fields.
- A **static method** belongs to the class and does not have a current object (`this`). It cannot directly access instance fields without an

## Instance Methods

An instance method performs an action using an individual object's data.

```java
public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
```

- `void` means the method does not return a value.
- The method is not `static`; it belongs to instances of Student.
- It needs no arguments because it reads the object's fields.

```java
student1.displayDetails();
student2.displayDetails();
```

Both calls use the same method definition, but each reads the fields of the object it is called on.

This lets us keep related data and behaviour together and avoids repeating the display code in Main.

## Constructors and `this`

A constructor initialises an object when it is created.

```java
public Student(String name, int age) {
    this.name = name;
    this.age = age;
}
```

A constructor:
- Has exactly the same name as its class.
- Has no return type, including no `void`.
- Can receive parameters to initialise the object's fields.

```java
Student student1 = new Student("Harsh", 21);
```

This creates a Student object and invokes its constructor with `"Harsh"` and `21`.

### Meaning of `this`

`this` refers to the current object.

In `this.name = name;`:
- `this.name` is the current object's field.
- `name` is the constructor parameter.
- The parameter's value is assigned to the field.

### No-Argument Constructor

If a class declares no constructors, Java supplies a default no-argument constructor.

Once we declare our parameterised constructor, Java does not supply that default constructor. Our current Student class therefore requires a name and age when creating an object.

### Earlier Examples

The earlier `new Student()` examples in these notes show the version before we added a constructor. The final version uses `new Student("Harsh", 21)`.