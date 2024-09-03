# Project 0: Person201

## Obtaining Project Code and Project Details

For details and FAQs, see [this document](docs/details.md) that has information on git, Java, the classes here, and more. This current file you're reading has project and coding details, but the linked document has more Java and git details, particularly about starting to code. That linked document includes information about project workflow including submitting code and analysis for grading via _Gradescope_. **Be sure to check [this document](https://coursework.cs.duke.edu/201fall24/resources-201/-/blob/main/projectWorkflow.md) for how to use Git to obtain the project files, and workarounds if Git doesn't work yet for you. You'll need to refer to this P0 document when forking and cloning.**

## Recording on Zoom
For this project and every APT quiz, you will record your screen via Zoom. For APT quizzes, you will record for the full duration of the quiz, but for this project, you will only record the first 20 minutes when you start coding -- not when you start reading, but when you're ready to code. You'll submit a URL for a cloud Zoom recording [using this link](https://duke.is/y/yfcv).

## Goals

* To modify a simple Java record/class, modify two driver programs, and create a new class to demonstrate understanding of classes, methods, and instance variables.
* To learn about running Java programs using the VSCode IDE
* To learn about using Git for project management.
* To learn about CompSci201 workflow for assignments: Git, Gradescope, helper hours.
* To learn about the difference between static and dynamic data sources, e.g., a file on your laptop and data accessible via a URL that can be updated by those in Compsci201

## Initial Engagement Points

You can earn four engagement points for this project.

* Answer the questions on the [pre-project engagement form](https://bit.ly/p0-pre-engage)
* Modify the definition of `Person p` in the file `PostPerson.java` to represent you, and run the program to post the information for the class to use.

For the second engagement. You should use the latitude and longitude of what you consider either your hometown or where you last went to high school. You can use your name or you can use a pseudonym. For the final parameter, you should use the name of your favorite 9th street eatery. It must be a restaurant from the following list.

"Juju", "Lime and Lemon", "Dain's Place", "Banh's Cuisine", "Blue Corn Cafe", "Monuts", "Alpaca", "Kiichi Ramen", "Bali Hai Mongolian Grill", "Burger Bach", "Vin Rouge", "Devil's Pizzeria", "The Loop", "Elmo's Diner", "Local 22", "Parizade", "Metro 8 Steakhouse", "Common Market", "Cosmic Cantina", "Happy + Hale", "International Delights", "Play Bowls", "Szechuan Mansion Hotpot", "Panera", "Zenfish Poke Bar", "Chicken Bee", "Mad Hatter Cafe", "Genji", "Jimmy John's", "Heavenly Buffaloes", "The Tavern", "Guasaca", "Shuckin' Shack"

## Developing the classes in Project P0: Person201

When you fork and clone the project, you'll be working primarily within the src folder with .java files -- many beginning with `Person201`. Your goal is to modify four programs/classes (`Person201.java`, `Person201Demo.java`, `CountEateries` and `Person201Nearby.java`), as well as to create a new program (`Person201Farthest.java`) to generate the desired output. As a challenge activity you'll be asked to determine the top/popular 9th street eateries among students in Compsci 201 this semester by creating a class/program `PopularEatery`.  


### Run `Person201Demo.java` and change `Person201.java`

First run the main method in `Person201Demo.java`, the output will be:

```
(037.80N,122.27W) claire, "Blue Corn Cafe"
(001.29S,036.82E) ricardo, "Elmo's Diner"
(040.71N,073.96W) julie, "Alpaca"
names: claire, ricardo, julie
Sam to Fred distance = 424.611 
```

Make changes to `Person201.java` by creating a _default constructor_ and then changing the definition of `Person201 c` in `Person201Demo` that's currently defined as someone named *julie* to be `Person201 c = new Person201()` (note: default constructor called) so the output will be as shown below. See the [help-doc/FAQ](docs/details.md) for more details on default constructors.

```
(037.80N,122.27W) claire, "Blue Corn Cafe"
(001.29S,036.82E) ricardo, "Elmo's Diner"
(035.99N,078.90E) Owen, "Dain's Place"
names: claire ricardo Owen
Sam to Fred distance = 424.611
```

Now that you've done this, change the `main` method in file `Person201Demo.java` by creating a new `Person201` variable named `s` (short for Sam) as follows:

`Person201 s = new Person201("Ethan", 40.6782, 73.0442, "Monuts");`

Next, change the definition of the array `people` to include `s` such that `s` appears between after `c`, e.g., Person201[] datas = {a,b,c,s}`. Run the program,  the output should be as shown here:

```
(037.80N,122.27W) claire, "Blue Corn Cafe"
(001.29S,036.82E) ricardo, "Elmo's Diner"
(035.99N,078.90E) Owen, "Dain's Place"
(040.68N,073.04E) Ethan, "Monuts"
names: claire, ricardo, Owen, Ethan
Sam to Fred distance = 424.611
```

### Running Person201Nearby, Modify Person201.java, and changing Data Source

Run the program `Person201Nearby`. It reads a data file and finds all the people in the data file who are within 50 miles of a person named Ricardo who lives near Seattle. The program prints there are 16 people. Change the value of the variable `threshold` until exactly 3 people live within `threshold` miles of Ricardo. Find the smallest `threshold` value that yields 3 people. You'll report on this value and how you obtained it in answering the *analysis questions* below.

Lines 11-13 in `Person201Nearby` specify three data sources: a regular text file named `foodlarge` in the `data` folder, a `foodsmall` file in the `data` folder (line 12), and a URL (line 13). How many people live within 50 miles of Ricardo when using the file `foodSmall` as the data source? Answer in *analysis questions* below. Then write a new line that reads data from the URL specified by the variable `largeURL`. You'll need to call the appropriate method in `Person201Utilities` to read a URL for a file, e.g., rather than calling `readFile` you'll call `readURL`. Verify that you get the same results from the URL as from the file since that URL references the same data as the file `foodlarge` in the `data` folder. You'll answer questions about these runs in the *analysis questions* section. 


### Create and Run a New Java Class: **Person201Farthest**

In the `src` folder create a new Java class named `Person201Farthest` (name the file `Person201Farthest.java`) that has only a `public static void main method` that allows the program to run. When run, the method should read the file `foodlarge.txt` in the `data` folder and determine the two distinct (i.e., inequal) `Person201` objects that are the farthest apart. You may find the code in `Person201NearbyDemo.java` useful in reasoning about the code you write. The program should print the two distinct objects that are closest together among all the objects created and returned when `PersonUtilities.readFile` is called from the code you write.

The `main` method you write *must* use the code below 
```
public static void main(String[] args) throws Exception {
        String file = "data/foodlarge.txt";
        double min = 0;
        Person201 a = null;
        Person201 b = null;
        // TODO: finish this method 
        System.out.printf("farthest distance is %3.2f between %s and %s\n",min,a.name(),b.name());
    }
```
See [the details](docs/details.md) documentation for details/hints.

## Checklist

Before you submit to Gradescope, check that you've done each of the following:

- Modify `Person201.java` by changing code in two places.
- Verify that running `Person201Demo.java` matches the expected output after modifying `Person201.java`
- Add a new `Person201` object in the `Person201Demo.java` program and verify that running `Person201Demo.java` matches the expected output.
- Run `Person201Nearby.java` , find threshold values as indicated, and verify that reading a file and the corresponding URL produce the same results.
- Create a new class `Person201Farthest` (in a new file named accordingly) with a `main` method to find the two distinct (i.e., inequal) people furthest apart from each other.

## Submission

You'll submit by pushing your code to Git and using Gradescope. Details can be found in [the details/FAQ](docs/details.md).

## Analysis

Answer all the questions here. As outlined in [this document](docs/details.md) you'll submit a PDF with your answers to Gradescope.

### Question 1
- How many instance variables are there in `Person201`?
- How many constructors are there in `Person201`?

### Question 2
- Does the main method of your `Person201Closest.java` create any objects of type `Person201Utilities`? Why or why not?

### Question 3
According to the `.equals` method of the `Person201` class, when are two `Person201` objects considered to be equal? Is it case sensitive for their names or for their phrases? (Case sensitive means different answers are returned depending on capitalization).

### Question 4
The online data for this project read via URL is encrypted. In a few sentences, why is it reasonable to have the online data encrypted?

### Question 5
Read/skim [this description of AES](https://techjury.net/blog/what-is-aes/), the encryption algorithm used in this project, e.g., see the code in `FileEncryptor.java`. What are two things you learned from this article that you think are relevant to your understanding of Computer Science?

### Question 6
As stated at the start of this document and in the course policies, you should record via Zoom the first 20 minutes of you working at the beginning of this project and submit a link to that recording using [this form](https://duke.is/y/yfcv). In your analysis document, include as an answer to Question 6 an affirmation "Yes, I submitted the URL for a Zoom recording." -- if, in fact, you did.

## Grading

Your submission will be graded by the following chart:

| Project Part | Points |
| ------ | ------ |
| Modify Person201 | 6 |
| Modify Person201Demo | 6 |
| Create Person201Closest | 6 |
| Zoom recording | 2 |
| Analysis | 5 |
