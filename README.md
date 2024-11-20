# TechJobs, OO Edition Autograded Rubric for Java 17

For [this assignment](https://education.launchcode.org/java-web-development/assignments/tech-jobs-oo.html), students are asked to refactor a version of the TechJobs Console assignment to make the code object-oriented and to add some unit testing.

Assignment Requirements:

1. Review Sally’s code in the Employer class to learn how to assign a unique ID.
2. Add getters, setters, and custom methods as needed to the Location, CoreCompetency, and PositionType classes.
3. Complete the Job class using what you learned in steps 1 and 2.
4. Use unit testing to verify the constructors and equals methods for the Job class.
5. Use TDD to design and code a custom toString method for the Job class.
6. Use inheritance to DRY the code within Employer, Location, CoreCompetency, and PositionType

## Unit Tests
 
The starter code contains 6 unit test classes.  Each class contains tests for each main task of the assignment.  This allows students to run tests upon completion of a task before moving on to the next one.
 
1. `TestTaskTwo` verifies that students completed the `Location`, `CoreCompetency`, and `PositionType` classes.
2. `TestTaskThree` verifies that students created the `jobClass` and that it uses the other classes correctly to create `job` objects.  
3. `TestTaskFour` verifies students' unit tests exist within the application.  
4. `TestTaskFive` tests the unit tests the students created for their custom `ToString` method.  
5. `TestTaskSix` verifies that students used proper inheritance between `Location`, `Employer`, `CoreCompetency`, `PositionType` and `JobField`.  For example, `Employer` should extend `JobField`.  These tests focus on the existance of the extension rather than the behavior of the extension. 
6. `AbstractTest` verifies the behavior of the DRY code.  

As you work on the components of the given tasks, continually re-run the tests to see the failing tests gradually turn to passing. When all tests within the file pass, you’re ready to move onto the next task.

Once you have completed the assignment, please follow the submission instructions at the bottom of this ReadMe.md

### Appearance and Output:
 
Expected output from hardcoded job data:
 
```
ID: 1
Name: Product tester
Employer: ACME
Location: Desert
Position Type: Quality control
Core Competency: Persistence
 
 
ID: 2
Name: Web Developer
Employer: LaunchCode
Location: St. Louis
Position Type: Front-end developer
Core Competency: JavaScript
 
 
ID: 3
Name: Ice cream tester
Employer: Data not available
Location: Home
Position Type: UX
Core Competency: Tasting ability
```

## Submitting Your Work

To submit your work please follow the [Submission Instructions](https://education.launchcode.org/java-web-dev-curriculum/assignments/hello-world/index.html#submitting-your-work-on-canvas).

Demo for Allison

What the program does
What’s the purpose of it? --"To organize, store, and present job data using objects using inheritance to minimize 
code repetition"
General Flow of the program. "Eventually, this app will be able to add and remove jobs via a user interface, 
by having been created with object-oriented design."

How would a user use the program? "The user will be able to specify fields of a job and have the app create 
a new Job ID assigned to it that coincides with all data related to that job in each class like employer, 
location, position type, and core competency."
What are some cool features you want to show? "Using the ternary operator in the toString to check in-line for 
blank fields."

Code
How did you do it? 
1.Created a Job object class to create unique job id and hold info for each job gathered from 
classes. 
2.Created each class with unique methods, then created a base class to DRY code to house all the common 
fields, constructors, getters/setter, and methods of each class employer, location, position type, and core competency.
3.Created Unit testing using TDD to ensure methods were coded well and properly returned expected data.

Why did you do it this way?
Object-oriented app design is more efficient for storing data than how the program was originally
written using HashMaps and ArrayLists. It eliminates the duplication of data stored in multiple places.
This means if there are multiple jobs with identical data in a field such as several jobs coming from one employer, 
there can be one object for each employer. The goal is to make it easy to add and remove jobs.
Also, if changes need to be made to any field, or if more info needs to be aspects of a class need to be extended or
modified it can be done one time in the class, applying it across jobs.


