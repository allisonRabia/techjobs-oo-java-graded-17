package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.testng.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

//Task 5 #1 toString return blank line before and after job info
    @Test

        public void testToStringStartsAndEndsWithNewLine() {
        Job job6 = new Job("Product Tester", new Employer("ACME"), new
                Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        int n = job6.toString().length();
        char first = job6.toString().charAt(0);
        char last = job6.toString().charAt(n-1);

       String firstChar = String.valueOf(first); //String firstChar = Character.toString(first);
       String lastChar = String.valueOf(last); //or String lastChar = Character.toString(last);

        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());

    }

    //Task 5 #2 to String contains a label for each field
    @Test
            public void testToStringContainsCorrectLabelsAndData() {
        Job job7 = new Job("Product Tester", new Employer("ACME"), new
                Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product Tester", job7.getName());
        assertEquals("ACME", job7.getEmployer().getValue());
        assertEquals("Desert", job7.getLocation().getValue());
        assertEquals("Quality Control", job7.getPositionType().getValue());
        assertEquals("Persistence", job7.getCoreCompetency().getValue());
    }

    //Task 5 #3 toString handles empty field
    @Test
            public void testToStringHandlesEmptyField() {
        Job job8 = new Job("", new Employer("ACME"), new
                Location(""), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        //assertEquals("Product Tester", job8.getName());
        //assertEquals("ACME", job8.getEmployer().getValue());
        assertEquals(job8.toString(), "\nID: 3\n" +
                "Name: Data not available\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Quality Control\n" +
                "Core Competency: Persistence\n");
        //assertEquals("Quality Control", job8.getPositionType().getValue());
        //assertEquals("Persistence", job8.getCoreCompetency().getValue());
    }



//TODO: test empty constructor

    Job job1;
    Job job2;

    public void createTestData() {
        job1 = new Job();
        job2 = new Job();
    }

    @Test

    public void testSettingJobId() {
        createTestData();
        String msg = "constructor correctly sets Job ID";
        int expected = job1.getId();
        int actual = job2.getId();
        assertNotEquals(expected, actual, msg);
    }


    //TODO: Test Full constructor
//public void createTestJob() {

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product Tester", new Employer("ACME"), new
                Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertNotNull(job3.getName());
        assertNotNull(job3.getEmployer());
        assertNotNull(job3.getLocation());
        assertNotNull(job3.getPositionType());
        assertNotNull(job3.getCoreCompetency());
        assertEquals("Product Tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality Control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());

    }

//    @Test
//    public void testInitialGasTank() {
//        Car test_car = new Car("Toyota", "Prius", 10, 50);
//        assertEquals(10, test_car.getGasTankLevel(), .001);
//    }
    //TODO: Test the equals Method


    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product Tester", new Employer("ACME"), new
                Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product Tester", new Employer("ACME"), new
                Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String msg = "Test that identical jobs are not equals if they have different ID";
        assertNotEquals(job4.getId(), job5.getId());
    }
}

