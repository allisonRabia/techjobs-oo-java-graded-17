package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {

//Task 5 #1 toString return blank line before and after job info
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job6 = new Job("Product Tester", new Employer("ACME"), new
                Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        int n = job6.toString().length();
        char first = job6.toString().charAt(0);
        char last = job6.toString().charAt(n-1);

        String firstChar = String.valueOf(first);
        String lastChar = String.valueOf(last);

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

        assertEquals(job8.toString(), lineSeparator() + "ID: 3" + lineSeparator() +
                "Name: Data not available" + lineSeparator() +
                "Employer: ACME" + lineSeparator() +
                "Location: Data not available" + lineSeparator() +
                "Position Type: Quality Control" + lineSeparator() +
                "Core Competency: Persistence" + lineSeparator());

    }


    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        int expected = job1.getId();
        int actual = job2.getId();
        assertNotEquals(expected, actual);
    }


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

