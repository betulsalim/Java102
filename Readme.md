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
