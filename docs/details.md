## Starter Code and Using Git
**_You should have installed all software (Java, Git, VS Code) before completing this project._** You can find 
the [directions for installation here](https://coursework.cs.duke.edu/201fall24/resources-201/-/blob/main/installingSoftware.md) (including workarounds for submitting without Git if needed).

We'll be using Git and the installation of GitLab at [coursework.cs.duke.edu](https://coursework.cs.duke.edu). All code for classwork will be kept here. Git is software used for version control, and GitLab is an online repository to store code in the cloud using Git.

**[This document details the workflow](https://coursework.cs.duke.edu/201fall24/resources-201/-/blob/main/projectWorkflow.md) for downloading the starter code for the project, updating your code on coursework using Git, and ultimately submitting to Gradescope for autograding.** We recommend that you read and follow the directions carefully this first time working on a project! While coding, we recommend that you periodically (perhaps when completing a method or small section) push your changes as explained in Section 5.


## Coding in Project P0: Person201

When you fork and clone the project, **make sure you open the correct project folder in VS Code** following the [This document details the workflow](https://coursework.cs.duke.edu/201fall24/resources-201/-/blob/main/projectWorkflow.md).

You will be working primarily with the `.java` files in the `src` folder beginning with `Person201.java`. You will modify two programs/classes (`Person201.java`,  `Person201Demo.java`), and will run `Person201Nearby.java` to see if your changes are working. Then you will create a new program called `Person201Farthest.java`.

Take a careful look at the main method you ran in `Person201Demo`. Note that it creates `Person201` **objects**. Those are defined in the `Person201.java` file using a **record**, rather than a **class**. When you run the program `Person201Nearby` you  can  see that it reads data about persons from a file by calling the static `readFile` method defined in `Person201Utilities.java`. The particular file, `data/foodlarge.txt`, contains data about some made-up people; the file is in the `data` folder of your project and you can view it directly in Visual Studio Code.

The main method you ran from `Person201Nearby` defines a query person and then search for all other persons in the provided data file `foodlarge.txt` that are _nearby_ to the query person, and print those people to the screen. 

### Fix Person201

Take a look at the `Person201.java` file. This is the Java record that defines `Person201` objects. In a Java `record`, instance variables are defined automatically by the variables specified in the `record` declaration/definition. So in this record you'll see four instance variables with identifiers `name`, `latitude`, `longitude`, and `eatery`. In the file `Person.java` you'll see what a Java class would look like with these instance variables explicitly declared at the beginning of the class definition with identifiers `myName`, `myLatitude`, `myLongitude`, and `myEatery`. The constructorin the `Person` class then assigns values to these instance variables explicitly. In a Java record, that assignmwent happens automatically. 

Note the **instance variables** defined first outside of any methods in the `Person` class - every `Person` object has a value for each of these that can be accessed with the `.` operator. In the `Person201` record, the four instance variables are named explicitly in the record constructor. Both the class and the record have a `toString` method, though the one in the record `Person201` includes more stylistic information, e.g., using "S" for south and "N" for north.

You will need to add a default/no-parameter constructor to the `Person201` record. Based on the instructions, the body of this constructor will be
```
    this("Owen", 35.99, 79.9, "Dain's Place");
```

### Interlude: Understanding Multi-file Programs 

Most software consists of **many** different files, each organized into smaller units called `methods` in Java (or functions in other languages). This practice helps us to keep code organized into comprehensible units. 

For this project, `Person201.java` defines `Person201` objects (what state, or data they hold and what basic operations they support), `Person201Utilities.java` defines static methods that do things having to do with multiple `Person201` objects, and `Person201Nearby.java` uses `Person201` objects and `Person201Utilities` methods to search for nearby people given a data source. 

### Create and Run a New Java Class: **Person201Farthest**

The main method of `Person201Nearby.java` searches for nearby people in the `data/foodlarge.txt` file of the data folder. In this part, you will write a new class with a new main method that searches for people who are farthest apart in a data file. 

In the `src` folder create a new file named `Person201Farthest.java` (it needs to have exactly that name, case sensitive!). Create a single `public` class named `Person201Farthest` in this file (again, exactly that name). Inside the class, create a single `public static void main(String[] args)` method. 

The main method you write should include code to find the two people in a data file that are farthest aparrt. You're given a skeleton for this method and you should add code to this skeleton.

Generate an array of `Person201` objects generated by reading the data located in the `foodlarge.txt` data file. Use the code in `Person201Nearby` as a model. 

When you have finished, run the main method of your new `Person201Farthest` class. If everything is correct, you should two people who are farthest apart. You'll need to reason about how to determine if your resuls are correct. You can compare your results to those of other students, you can create a different data file and use that (where you know the results, for example).

## Analysis Questions

Answer the questions in the assignment. You'll submit your analysis as a separate PDF as a separate assignment ***to Gradescope***. To create a PDF, use a word processing program like Microsoft Word, or Google Doc, then choose print and save-as-PDF.

***After completing the analysis questions you submit your answers in a PDF to Gradescope in the appropriate assignment.***

## Submission and Grading
You will submit the assignment on Gradescope. You can access Gradescope through the tab on Sakai. The [project workflow writeup](https://coursework.cs.duke.edu/201fall24/resources-201/-/blob/main/projectWorkflow.md) explains the how to submit your project in detail. Be sure to push changes often and be sure your final program is in your Git repository before you submit it for autograding on Gradescope. Please take note that changes/commits on GitLab are NOT automatically synced to Gradescope. You are welcome to submit as many times as you like, only the most recent submission will count for a grade.
