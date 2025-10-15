package iscteiul.ista;

/**
 * Represents a student with a name and an identification number.
 */
public class Student {

    private String name;
    private int number;

    /**
     * Creates a new Student with the given name and number.
     * @param name The name of the student.
     * @param number The identification number of the student.
     */
    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', number=" + number + "}";
    }
}
