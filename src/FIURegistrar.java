/**
 *This program will display GPA statistics of students who attend a university,
 * additionally displaying my understanding of using arrays and loops.
 */

import java.util.Scanner;
/*
    The FIU Registrar class will hold all the methods that will bring all the student information together.
 */
public class FIURegistrar {
    public static void main(String[] args) {
            /*
                In our main method we will be asking the user for the number of students being created while
                passing the data from createArrayOfStudents into processArrayOfStudents in order to use the gpa data to
                calculate min-max-avg student gpa of all students.
             */
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many students will be created?");
        System.out.println();
        int number = keyboard.nextInt();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        Student[] students = createArrayOfStudents(number);
        processArrayOfStudents(students);
    }
    /*
        The createArrayOfStudents method will initialize student data to local variables regarding gpa, name, and
        panther id. The local variables will then be initialized to the private variables declared in the Student
        class where we are returning the aStudent information. We are using a for loop that will loop until the
        number of said students (by the user of the program) is reached.
     */
    public static Student[] createArrayOfStudents(int number) {
        Scanner keyboard = new Scanner(System.in);
        Student[] aStudent = new Student[number];
        String firstName = "";
        String lastName = "";
        String pantherID = "";
        double gpa;
        for (int i = 0; i < number; i++) {
            System.out.println("Student #" + (i + 1));
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Please enter your first name: ");
            firstName = keyboard.next();
            System.out.println();
            System.out.print("Please enter your last name: ");
            lastName = keyboard.next();
            System.out.println();
            System.out.print("Please enter your Panther ID: ");
            pantherID = keyboard.next();
            System.out.println();
            System.out.print("Please enter your GPA: ");
            gpa = keyboard.nextDouble();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            aStudent[i] = new Student(firstName, lastName, pantherID, gpa);
            System.out.println(aStudent[i]);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
        return aStudent;
    }
    /*
        The processArrayOfStudents method will calculate and display the minimum, maximum, and average of all
        student GPAs with information given from the createArrayOfStudents method.
     */
    public static void processArrayOfStudents(Student[] aStudent) {
        System.out.println("Now calculating the minimum, maximum, and average of all students...");
        Student maximumGpa = aStudent[0], minimumGpa = aStudent[0];
        double sum = 0;
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for (int i = 0; i < aStudent.length; i++) {
            if (aStudent[i].getGpa() > maximumGpa.getGpa()) {
                maximumGpa = aStudent[i];
            }
            if (aStudent[i].getGpa() < minimumGpa.getGpa()) {
                minimumGpa = aStudent[i];
            }
            sum += aStudent[i].getGpa();
        }
        System.out.println("The student with the highest GPA is " + maximumGpa);
        System.out.println();
        System.out.println("The student with the lowest GPA is " + minimumGpa);
        System.out.println();
        System.out.println("The average student GPA is " + sum / aStudent.length);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }
}
