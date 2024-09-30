package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
   @Test
    public void testSettingJobId() {
       Job job = new Job(12345);
       Job job1 = new Job(12456);
       assertNotEquals(job, job1);
   }
    //TODO: Create your unit tests here

   @Test
   public void testJobConstructorSetsAllFields(){
      Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
              new PositionType("Quality control"), new CoreCompetency("Persistence"));

      assertTrue(job.getName() instanceof String);
      assertEquals("Product tester", job.getName());

      assertTrue(job.getEmployer() instanceof Employer);
      assertEquals("ACME", job.getEmployer().getValue());

      assertTrue(job.getLocation() instanceof Location);
      assertEquals("Desert", job.getLocation().getValue());

      assertTrue(job.getPositionType() instanceof PositionType);
      assertEquals("Quality control", job.getPositionType().getValue());

      assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
      assertEquals("Persistence", job.getCoreCompetency().getValue());

   }

   @Test
   public void testJobsForEquality(){
      Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
              new PositionType("Quality control"), new CoreCompetency("Persistence"));
      Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
              new PositionType("Quality control"), new CoreCompetency("Persistence"));
      assertFalse(job1.equals(job2));
   }

   @Test
   public void testToStringStartsAndEndsWithNewLine(){
      Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
              new PositionType("Quality control"), new CoreCompetency("Persistence"));
      String jobs = job.toString();

      assertTrue(jobs.startsWith(System.lineSeparator()));

      // Check that the string ends with a new line
      assertTrue(jobs.endsWith(System.lineSeparator()));


   }
   @Test
   public void testToStringContainsCorrectLabelsAndData(){
      Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
              new PositionType("Quality control"), new CoreCompetency("Persistence"));
      String test = System.lineSeparator() +
              "ID: " + job.getId() + System.lineSeparator() +
              "Name: Product tester" + System.lineSeparator() +
              "Employer: ACME" + System.lineSeparator() +
              "Location: Desert" + System.lineSeparator() +
              "Position Type: Quality control" + System.lineSeparator() +
              "Core Competency: Persistence" + System.lineSeparator();
            assertEquals(test, job.toString());

   }
   @Test
   public void testToStringHandlesEmptyField() {
      Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

      String expected = System.lineSeparator() +
              "ID: " + job.getId() + System.lineSeparator() +
              "Name: Data not available" + System.lineSeparator() +
              "Employer: Data not available" + System.lineSeparator() +
              "Location: Data not available" + System.lineSeparator() +
              "Position Type: Data not available" + System.lineSeparator() +
              "Core Competency: Data not available" + System.lineSeparator();

      assertEquals(expected, job.toString());
   }

}
