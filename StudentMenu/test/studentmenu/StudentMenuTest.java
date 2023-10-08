/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package studentmenu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thule
 */
public class StudentMenuTest {
      @Test
    public void testSaveStudent() {
        // This test for saved studentds
        // Gives student details and checks  the correct student is saved
    }

    @Test
    public void testSearchStudent() {
        // Test search student method
        // Provide a student ID and assert the correct student details are returned
    }

    @Test
    public void testSearchStudent_StudentNotFound() {
        // Test search student method when student is not found
        // Provide an incorrect student ID and assert no student is found
    }

    @Test
    public void testDeleteStudent() {
        // Test delete student method
        // Provide a student ID and assert the student is successfully deleted
    }

    @Test
    public void testDeleteStudent_StudentNotFound() {
        // Test delete student method when student is not found
        // Provide an incorrect student ID and assert no student can be found to delete
    }

    @Test
    public void testStudentAge_StudentAgeValid() {
        // Test student age method with a valid student age
        // Provide a valid student age and assert it is considered valid
    }

    @Test
    public void testStudentAge_StudentAgeInvalid() {
        // Test student age method with an invalid student age (less than 16)
        // Provide an invalid student age and assert it is considered invalid
    }

    @Test
    public void testStudentAge_StudentAgeInvalidCharacter() {
        // Test student age method with an invalid character as student age
        // Provide an invalid character and assert it is not considered a valid student age
    }
}
    
    

   

    /**
     * Test of main method, of class StudentMenu.
     */
   
    

