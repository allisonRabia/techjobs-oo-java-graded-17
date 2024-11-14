package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.testng.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
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
//        String msg1 = "Test that the constructor correctly assigns the class of each field";
//        String msg2 = "Test that the constructor correctly assigns the class of each field";
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

