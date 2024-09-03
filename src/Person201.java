/**
 * For use in Compsci 201, P0, Duke University
 * @author ola, Owen Astrachan
 * To be modified by students in 201, when you make
 * a modification, add yourself as an author in these
 * comments.
 * @version 3.0, Fall 2024, Changed from Class to Record
 * also changed phrase to eatery
 *
 */
public record Person201(String name, double latitude, double longitude, String eatery) {

    /**
     * Returns String using E/W for longitude, N/S for latitude
     */
    
    @Override
    public String toString(){
        String lats = String.format("%06.2f",Math.abs(latitude));
        if (latitude < 0) {
            lats += "S";
        }
        else {
            lats += "N";
        }
        String lons = String.format("%06.2f",Math.abs(longitude));
        if (longitude < 0) {
            lons += "W";
        }
        else {
            lons += "E";
        }
        return String.format("(%s,%s) %s, \"%s\"",lats,lons,name,eatery);
    }
    public static void main(String[] args) {
        Person201 p = new Person201("Owen",35.994, 78.898, "Dain's Place");
        System.out.println(p);
    }
}

