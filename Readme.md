<h1>Java 102</h1>
<hr>
<h2>Acces Modifiers</h2>
<p>In our first Lesson we learned Acces Modifiers: 
<br> 
Public
<br>
Private
<br>
Protected
<br>
Default
</p>
<hr>
<h3>1. Public (public)</h3>
Visibility: The element is accessible from any class or package.
Usage: Used for classes, methods, or variables that need to be accessible universally.
Example:
public class MyClass { }


<h3> 2. Private (private) </h3>
Visibility: The element is only accessible within the same class where it is defined. Other classes cannot access it directly.
Usage: Used for encapsulating data and restricting access to the class internals.
Example:
private int myVar;


<h3> 3. Protected (protected) </h3>
Visibility: The element is accessible within the same package and by subclasses (even if they are in different packages).
Usage: Useful for allowing inheritance while restricting access from other non-related classes.
Example:
protected void myMethod() { }



<h3> 4. Default (Package-Private) </h3>
Visibility: If no access modifier is specified, the element is accessible only within the same package.
Usage: Used for package-private access where elements should only be available to classes in the same package.
Example:
int myVar;


<h4> Summary: </h4>
<strong> public: Accessible everywhere.
private: Accessible only within the same class.
protected: Accessible within the same package and subclasses.
No modifier (default): Accessible only within the same package.
These modifiers help in creating more maintainable and secure code by controlling the visibility of different components.</strong> 
<hr>
<br>
<h2> Statics in Java </h2>
In Java, the static keyword is used to indicate that a member (field, method, or nested class) belongs to the class rather than instances of the class. This means static members are shared across all instances of the class.

<h3> Features of static </h3>
<h4> Static Variables: </h4>

Belong to the class rather than any specific instance.
Commonly used for constants or shared properties.
Memory is allocated only once, at the class loading time.


Example:
public class Example {
static int counter = 0;  // Shared across all instances
}


<h4> Static Methods: </h4>

Can be called without creating an instance of the class.
Cannot directly access instance variables or methods (because they don't belong to any specific instance).
Often used for utility or helper methods.


Example:
public class Utils {
    static void printMessage(String message) {
        System.out.println(message);
    }
}
Utils.printMessage("Hello, Static!");


<h4> Static Blocks: </h4>

Used to initialize static variables or perform operations when the class is loaded.
Executed only once when the class is first loaded into memory.
Example:

public class Example {
static int value;

    static {
        value = 42;  // Initialize static variable
        System.out.println("Static block executed");
    }
}


<h4> Static Nested Classes: </h4>

A nested class marked with static does not require an instance of the outer class to be instantiated.
Useful for grouping classes logically.


Example:
public class OuterClass {
    static class NestedClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}


<h3> Key Points </h3>

<strong> Memory Efficiency: Static members save memory as they are shared across instances.
Utility Focus: Static methods are commonly used for reusable operations (e.g., Math.sqrt()).
Restricted Access: Static methods cannot access instance members directly (need an object reference).
Limitations
Static methods cannot use this or super because they do not belong to an instance.
Overusing static members can lead to tightly coupled code, reducing flexibility and testability.
Common Use Cases
Utility Classes: e.g., Math, Collections.
Counters or Shared Data: Tracking the number of instances created.
Constants: Using static final for immutable class-level constants. </strong>
