/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author User
 */
public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize() {        
        this.management = new ExerciseManagement();    
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, this.management.exerciseList().size());
    }
    
    @Test    
    public void addingExerciseGrowsListByOne() {                
        this.management.add("Write a test");        
        assertEquals(1, this.management.exerciseList().size());    
    }
    
    @Test   
    public void addedExerciseIsInList() {          
        this.management.add("Write a test");        
        assertTrue(this.management.exerciseList().contains("Write a test"));    
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {    
        management.add("New exercise");    
        management.markAsCompleted("New exercise");    
        assertTrue(management.isCompleted("New exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {    
        management.add("New exercise");    
        management.markAsCompleted("New exercise");    
        assertFalse(management.isCompleted("Some exercise"));
    }
}
