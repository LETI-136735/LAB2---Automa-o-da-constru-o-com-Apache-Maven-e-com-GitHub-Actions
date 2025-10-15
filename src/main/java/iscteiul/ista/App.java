package iscteiul.ista;

import com.google.gson.Gson;

/**
 * Demonstrates JSON serialization and deserialization using the Gson library.
 */
public class App {

    public static void main(String[] args) {
        Gson gson = new Gson();

        // Create a Student object and serialize it to JSON
        Student john_Student = new Student("John", 123456);
        String john = gson.toJson(john_Student);

        System.out.println("Serialized JSON:");
        System.out.println(john);

        // Deserialize JSON back into a Student object
        String paul = "{\"name\":\"Paul\",\"number\":987654}";
        Student paul_Student = gson.fromJson(paul, Student.class);

        System.out.println("\nDeserialized Object:");
        System.out.println(paul_Student);
    }
}
