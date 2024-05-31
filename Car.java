import java.util.ArrayList;

    class Car {
        public String name;
        public ArrayList<String> colors;

        public Car(String name, ArrayList<String> colors)
        {
            this.name = name;
            this.colors = colors;
        }
    public static void main(String[] args)
    {
        // Create a Honda car object
        ArrayList<String> hondaColors = new ArrayList<>();
        hondaColors.add("Red");
        hondaColors.add("Blue");
        Car honda = new Car("Honda", hondaColors);

        // Deep copy of Honda
        Car deepcopyHonda = new Car(
                honda.name, new ArrayList<>(honda.colors));
        deepcopyHonda.colors.add("Green");
        System.out.print("Deepcopy: ");
        for (String color : deepcopyHonda.colors) {
            System.out.print(color + " ");
        }
        System.out.println("\nOriginal: ");
        for (String color : honda.colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        // Shallow Copy of Honda
        Car copyHonda = honda;
        copyHonda.colors.add("Green");
        System.out.print("Shallow Copy: ");
        for (String color : copyHonda.colors) {
            System.out.print(color + " ");
        }
        System.out.println("\nOriginal: ");
        for (String color : honda.colors) {
            System.out.print(color + " ");
        }
        System.out.println();
    }
}


/*
shallow copy
-Shallow copy creates a new object and copies the references of the original object’s elements into the new object.
-The new object references the same memory locations as the original object for its elements.
-If any changes are made to the shared elements in the new or original object, the changes will be reflected in both.
-Shallow copy is a relatively faster operation and requires less memory.
-Shallow copy is suitable when you want to create a new object, but you don’t need independent copies of the elements.
-The default version of the clone() method supports shallow copy.


Deep Copy
-Deep copy creates a new object and recursively copies the elements of the original object, including any objects referenced within it.
-The new object has its own memory locations for all the elements, including the referenced objects.
-Changes made to the elements in the deep copy do not affect the original object or any other copied objects.
-Deep copy is a relatively slower operation and requires more memory, especially for complex data structures.
-Deep copy is suitable when you want to create a completely independent copy of an object, including all its nested objects.
-In order to make the clone() method support the deep copy, one has to override the clone() method.
-or the deep copy, it needs to ensure that all the member classes also implement the Cloneable interface
because of overriding the clone() method of the object class.
-In can not directly call clone() method using object.clone() as clone method in Object class of java is protected. So override the
function by making access modifier as public in return super.clone() from the class created to override


In fact, there is no difference between deep and shallow copy when we are dealing with strings as well as primitives in Java.
 Lazy copy is, in fact, the mixture of the deep and shallow copy. In lazy copy, the shallow copy is used'
 at the starting stage. When one modifies the original content, the program checks whether the content is shared
 among the other objects or not with the help of a counter. If the content is shared, then the deep copy mechanism is applied.

 deep copy program
 // Java Program to show Deep Cloning

// Importing java input/output libraries
import java.io.*;

// Class
public class GFG implements Cloneable {

// Defining a method as clone method is protected
// Defining within the class called cloneable interface
public Object clone() throws CloneNotSupportedException
{
return (GFG)super.clone();
}

	// Main driver method
	public static void main(String[] args) throws CloneNotSupportedException
	{
		// Creating first object of GFG class
		GFG t1 = new GFG();

		// Using clone() method to create duplicate object
		// of t1 reference variable
		// else for every object manually object needs
		// to be copied in deep copying
		// clone() ease this manual effort
		GFG t2 = (GFG)t1.clone();

		// Comparing two objects just after deep copying
		// Returning true for shallow(by default) copying
		// Returning false for deep copying
		System.out.println(t1 == t2);
	}
}

 */
