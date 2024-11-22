www.patika.dev
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

<h2> 1. Polymorphism </h2>
   Definition: Polymorphism means "many forms". It allows objects of different classes to be treated as objects of a common superclass.
   Types:
   Compile-time (Method Overloading): Multiple methods with the same name but different parameters in the same class.
   Runtime (Method Overriding): A subclass provides a specific implementation of a method already defined in the superclass.
   Purpose: It helps in reducing complexity by allowing a single interface to represent different underlying forms (data types).
   Example:
    
    class Animal {
        void sound() {
            System.out.println("Animal sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark");
        }
    }

    public class Main {
        public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();  // Outputs "Bark"
        }
    }

<h2> 2. Abstraction </h2>
   Definition: Abstraction is the concept of hiding complex implementation details and showing only the essential features of an object.
   Purpose: It simplifies the interface by providing a clear distinction between what an object does and how it achieves it.
   Implementation:
   Abstract classes: Can have abstract methods (without implementation) and concrete methods (with implementation).
   Interfaces: Define a contract of methods that implementing classes must provide.
   Example:


    abstract class Vehicle {
        abstract void move();
    }

    class Car extends Vehicle {
        @Override
        void move() {
            System.out.println("Car is moving");
        }
    }


<h2> 3. Interfaces </h2>
   Definition: An interface is a reference type in Java that contains only abstract methods and constants. It is used to specify a contract for classes that implement it.
   Purpose: To define a set of methods that classes must implement, promoting loose coupling and flexibility in design.
   Key Points:
   Interfaces cannot have method implementations (prior to Java 8).
   A class can implement multiple interfaces.
   Interfaces allow for defining a set of behaviors that different classes can share.
   Example:


    interface Animal {
        void sound();  // Abstract method
    }

    class Dog implements Animal {
        @Override
        public void sound() {
            System.out.println("Bark");
        }
    }
<hr>
<h3> Summary: </h3>
<strong>
Polymorphism enables objects to behave differently based on their actual class type.
Abstraction hides implementation details and shows only the necessary functionality.
Interfaces define methods that implementing classes must provide, promoting flexibility and decoupling in the design.
</strong>
<hr>
<br>
<h1> Adventure Game (Java) </h1>
<hr>

This project is a simple text-based adventure game developed in Java. The game is structured around various locations where the player interacts with different monsters, earns rewards, and can progress through the game world. The goal is to explore different locations, defeat monsters, collect rewards, and upgrade the player's attributes to become stronger.


1 - About the Game <br>
2 - Features <br>
3 - Game Mechanics <br>
4 - Setup and Installation <br>
5 - How to Play <br>
6 - Technologies Used <br>
7 - License <br>

<h2> 1 - About the Game </h2>
<hr>
In this adventure game, the player controls a character who navigates through different locations. The player will encounter monsters at certain locations, battle them, and collect rewards. Some rewards will increase the player’s stats, such as health, damage, and money.

Key features of the game include:

<strong> Battle Locations: </strong> Locations where the player can fight monsters and gain rewards.
<strong> SafeHouse: </strong> A safe place where the player can recover and collect their earned rewards.
<strong> Monsters: </strong> Different types of monsters with varying health, damage, and rewards.
<strong> Player Stats: </strong> The player's health, damage, and money are tracked throughout the game.
<hr>
<h2>2 - Features </h2>
<hr>

<strong> Multiple locations to explore, including a SafeHouse and Battle Locations. 
The player can collect rewards after defeating monsters.</strong>
<strong> Combat System: </strong> Turn-based combat where the player and monsters take turns attacking.
<strong> Item System:</strong> Weapons and armor that enhance the player’s abilities.
<strong> Randomized Combat:</strong> Monsters appear randomly based on location settings.
<strong> Player Progression:</strong> Player’s health, damage, and money increase as they defeat monsters and earn rewards.
<hr>
<h2> 3 - Game Mechanics </h2>

Player Interaction:

The player can choose to fight or flee when encountering monsters.
Health, damage, and money are tracked and displayed during combat.
Rewards can be collected after winning battles, and the player can use them to improve their character.

<h3> Combat: </h3>

The player and the monster take turns attacking each other until one’s health reaches zero.
The player’s damage is influenced by their weapon, and the monster's damage is influenced by its own attributes.


<h3> Battle Locations: </h3>

A variety of locations are available, each with a different set of monsters.
The player can fight multiple monsters at a time in certain locations.
Rewards are tied to the monsters and can be earned after defeating them.


<h3> SafeHouse: </h3>

A location where the player can rest and recover health.
The player can also collect any rewards earned from previous battles at this location.
Setup and Installation
To run this game on your local machine, follow these steps:

<h2> Clone the repository: </h2>
<strong>

    git clone https://github.com/your-username/adventure-game.git
    Navigate to the project directory:
</strong>
<strong>
   
    
    cd adventure-game
    Compile and run the project using Java:
</strong>
<strong>

    javac Game.java
    java Game
    Make sure you have Java installed on your system. You can download it from here. 
</strong>

<h2> How to Play </h2>
<hr>
Start the Game:

Run the game by following the setup instructions.
Enter your name when prompted to start the game.
Navigating the Game:

Explore different locations like the Battle Locations and SafeHouse.
When you enter a Battle Location, monsters may appear, and you’ll have the option to fight or flee.
Defeat monsters to earn rewards (e.g., money, food) and improve your character.
Combat:

When a combat starts, you’ll be prompted to choose between attacking ("V") or fleeing ("K").
The player and the monster will take turns attacking each other until one of them loses all health.
Collecting Rewards:

After defeating monsters, you can collect rewards such as food or money.
Rewards can be collected in the SafeHouse.
<hr>
<h2> Technologies Used </h2>
<strong>Java: The programming language used for the development of the game.
Object-Oriented Programming (OOP): The game is built using OOP principles, with classes representing the player, monsters, locations, and game mechanics.
</strong>
<hr>
<h2> License </h2>
This project is licensed under the MIT License - see the LICENSE file for details.

