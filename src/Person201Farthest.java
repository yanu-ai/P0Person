public class Person201Farthest {
public static void main(String[] args) throws Exception {
    String file = "data/foodlarge.txt";
    double max = 0;
    Person201 a = null;
    Person201 b = null;
    Person201[] people = Person201Utilities.readFile(file);
    for (Person201 p1 : people) {
        for (Person201 p2 : people) {
            double d = Person201Utilities.distance(p1, p2);
            if (d > max) {
                max = d;
                a = p1;
                b = p2;
            }
        }
    }
    
    
    
    
    System.out.printf("farthest distance is %3.2f between %s and %s\n",max,a.name(),b.name());
}
}

