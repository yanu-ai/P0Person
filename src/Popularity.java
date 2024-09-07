import java.util.*;

public class Popularity {
    public static String URL = "https://courses.cs.duke.edu/compsci201/fall24/data/p0/compsci201.log";
    public static void main(String[] args){
        Map<String, Integer> popular = new HashMap<>();
        String popular_eatery = "";
        int max_votes = 0;
        try {
            Person201[] pa = PeopleDownloader.loadData(URL);
            for(Person201 p : pa) {
                String eatery = p.eatery();
                popular.put(eatery, popular.getOrDefault(eatery, 0) + 1);
            }
            Iterator<String> iter = popular.keySet().iterator();
            while (iter.hasNext()) {
                String temp_eatery = iter.next();
                int votes = popular.getOrDefault(temp_eatery, 0);
                if (votes > max_votes) {
                    max_votes = votes;
                    popular_eatery = temp_eatery;
                }
            }
            System.out.printf("Most popular: " + popular_eatery);
        }
        catch (Exception e) {
            System.err.println("problem loading data");
            e.printStackTrace();
        }
    }
}
