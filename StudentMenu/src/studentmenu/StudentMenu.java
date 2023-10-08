/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmenu;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author thule
 */
public class StudentMenu {
 private static ArrayList<CollegeLearners> students = new ArrayList<>();
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         

  
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Capture a new student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Print student report");
            System.out.println("5. Exit application");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    captureNewStudent(scanner);
                    break;
                case 2:
                    searchForStudent(scanner);
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    printStudentReport();
                    break;
                case 5:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    private static void captureNewStudent(Scanner scanner) {
        System.out.print("Enter the name of the new student: ");
        String name = scanner.nextLine();

        int age;
        do {
            System.out.print("Enter the age of the new student: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid age. Please enter a valid number.");
                scanner.next();
            }
            age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            if (age < 16) {
                System.out.println("Invalid age. Age must be greater than or equal to 16.");
            }
        } while (age < 16);

        System.out.print("Enter the ID of the new student: ");
        String id = scanner.nextLine();

        System.out.print("Enter the major of the new student: ");
        String major = scanner.nextLine();

        CollegeLearners student = new CollegeLearners(name, age, id, major);
        students.add(student);
        System.out.println("New student captured successfully!");
    }

    private static void searchForStudent(Scanner scanner) {
        System.out.print("Enter the ID of the student to search for: ");
        String id = scanner.nextLine();

        boolean found = false;
        for (CollegeLearners student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student found!");
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Major: " + student.getMajor());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Enter the ID of the student to delete: ");
        String id = scanner.nextLine();

        boolean found = false;
        for (CollegeLearners student : students) {
            if (student.getID().equals(id)) {
                System.out.println("Are you sure you want to delete the following student?");
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Major: " + student.getMajor());
                System.out.print("Enter 'yes' to confirm deletion: ");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("yes")) {
                    students.remove(student);
                    System.out.println("Student deleted successfully!");
                } else {
                    System.out.println("Deletion canceled.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    private static void printStudentReport() {
        System.out.println("Student Report:");
        for (CollegeLearners student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Major: " + student.getMajor());
            System.out.println();
        }
    }}
