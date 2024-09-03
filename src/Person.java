/**
 * Class Person used to illustrate differences between a Class and a Record in Java
 */
public class Person {
    private String myName;
    private double myLatitude;
    private double myLongitude;
    private String myEatery;

    public Person(String name, double lat, double lon, String eatery){
        myName = name;
        myLatitude = lat;
        myLongitude = lon;
        myEatery = eatery;
    }

    public String toString(){
        return myName + "," + myLatitude + "," + myLongitude + "," + myEatery;
    }

    public static void main(String[] args) {
        Person p = new Person("Owen",35.994, 78.898, "Dain's Place");
        System.out.println(p);
    }
}
