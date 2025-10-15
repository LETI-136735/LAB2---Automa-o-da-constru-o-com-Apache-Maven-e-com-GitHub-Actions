package iscteiul.ista;

import com.google.gson.Gson;

/**
 * Demonstrates JSON serialization and deserialization using the Gson library.
 */
public class App {

    public static void main(String[] args) {
        Gson gson = new Gson();

        // Create a Student object and serialize it to JSON
        Student hugo = new Student("Hugo Iglesias", 136735);
        String hugoJson = gson.toJson(hugo);

        System.out.println("Serialized JSON:");
        System.out.println(hugoJson);

        // Deserialize JSON back into a Student object
        String exampleJson = "{\"name\":\"Miguel Santos\",\"number\":987654}";
        Student exampleStudent = gson.fromJson(exampleJson, Student.class);

        System.out.println("\nDeserialized Object:");
        System.out.println(exampleStudent);
    }
}
