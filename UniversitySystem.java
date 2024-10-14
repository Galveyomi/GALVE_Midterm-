// Person class (Base Class)
class Person {
    // Fields representing a person's attributes
    private String name;
    private int age;

    // Constructor to initialize name and age of the person
    public Person(String fullName, int personAge) {
        this.name = fullName;
        this.age = personAge;
    }

    // Method to display the person's basic information
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter methods to access private fields if needed by subclasses
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Student class (inherits from Person)
class Student extends Person {
    // Additional fields specific to students
    private String studentID;
    private String course;
    private int unitsTaken;
    private static final int COST_PER_UNIT = 1000; // Constant for fee per unit

    // Constructor for Student class, initializing fields
    public Student(String name, int age, String id, String courseEnrolled, int units) {
        super(name, age);  // Call to the superclass (Person) constructor
        this.studentID = id;
        this.course = courseEnrolled;
        this.unitsTaken = units;
    }

    // Method to calculate the total fee based on the number of units
    public double computeTotalFees() {
        return unitsTaken * COST_PER_UNIT;
    }

    // Overriding the showInfo method to include student-specific details
    @Override
    public void showInfo() {
        // Calling the parent class method to display basic person information
        super.showInfo();
        // Adding student-specific information
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + unitsTaken);
        System.out.println("Total Fees: $" + computeTotalFees());
    }
}

// Instructor class (inherits from Person)
class Instructor extends Person {
    // Additional fields specific to instructors
    private String employeeID;
    private String department;
    private double salary;

    // Constructor for Instructor class, initializing fields
    public Instructor(String name, int age, String empID, String dept, double empSalary) {
        super(name, age);  // Call to the superclass (Person) constructor
        this.employeeID = empID;
        this.department = dept;
        this.salary = empSalary;
    }

    // Overriding the showInfo method to include instructor-specific details
    @Override
    public void showInfo() {
        // Calling the parent class method to display basic person information
        super.showInfo();
        // Adding instructor-specific information
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Main class to demonstrate the system functionality
public class UniversitySystem {
    public static void main(String[] args) {
        // Creating the first Student object and initializing with some data
        Student student1 = new Student("Yomi Rose Galve ", 19, "231005392", "Computer Engineering", 4);
        // Displaying the first student's information
        System.out.println("Student 1 Details:");
        student1.showInfo();  // Method call to display student's full info
        
        System.out.println();  // Line break for readability

        // Creating the second Student object and initializing with different data
        Student student2 = new Student("Dong Liqi", 20, "231000901", "Electrical Engineering", 6);
        // Displaying the second student's information
        System.out.println("Student 2 Details:");
        student2.showInfo();  // Method call to display student's full info

        System.out.println();  // Line break for readability
        
        // Creating an Instructor object and initializing with some data
        Instructor instructor = new Instructor("Engr. Tanya C. Jovillano", 28, "EMP213", "Computer Science", 85000);
        // Displaying the instructor's information
        System.out.println("Instructor Details:");
        instructor.showInfo();  // Method call to display instructor's full info

         // Creating the second Instructor object and initializing with different data
Instructor instructor2 = new Instructor("Eng. Emily A. Santos", 42, "EMP765", "Electrical Engineering", 90000);
// Displaying the second instructor's information
System.out.println("Instructor 2 Details:");
instructor2.showInfo();  // Method call to display instructor's full info

        
    }
}
