import java.io.*;
import java.util.*;

class RepresentationsDemo {
    // Primitive Data Representation
    int num = 100;  // Integer representation
    double decimal = 99.99;  // Floating point representation
    char letter = 'A';  // Character representation
    boolean flag = true;  // Boolean representation

    // Array Representation
    int[] numbers = {10, 20, 30, 40, 50};

    // Object Representation
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Person: " + name + ", Age: " + age);
        }
    }

    // Collection Representation (List)
    List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));

    // File Representation (Writing and Reading)
    void fileHandling() {
        try {
            // Writing to file
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is a file representation in Java.");
            writer.close();
            
            // Reading from file
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("File Content: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        RepresentationsDemo demo = new RepresentationsDemo();

        // Displaying Primitive Data
        System.out.println("Integer: " + demo.num);
        System.out.println("Double: " + demo.decimal);
        System.out.println("Character: " + demo.letter);
        System.out.println("Boolean: " + demo.flag);

        // Displaying Array
        System.out.println("Array Elements: " + Arrays.toString(demo.numbers));

        // Creating and Displaying Object
        Person p1 = new Person("John Doe", 25);
        p1.display();

        // Displaying Collection
        System.out.println("Fruits List: " + demo.fruits);

        // File Handling Demonstration
        demo.fileHandling();
    }
}
 