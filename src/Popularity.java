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
            String[] eatery_array = new String[popular.keySet().size()];
            int[] votes_array = new int[popular.keySet().size()];
            Iterator<String> iter = popular.keySet().iterator();
            int index = 0;
            while (iter.hasNext()) {
                String temp_eatery = iter.next();
                eatery_array[index] = temp_eatery;
                votes_array[index] = popular.getOrDefault(temp_eatery, 0);
                int votes = popular.getOrDefault(temp_eatery, 0);
                if (votes > max_votes) {
                    max_votes = votes;
                    popular_eatery = temp_eatery;
                }
                index++;
            }
            System.out.println("Most popular: " + popular_eatery + " with " + max_votes + " votes");
            System.out.println("List of 10 most popular eateries below:");
            String[][] eatery_vote = new String[eatery_array.length][2];
            for (int i = 0; i < eatery_array.length; i++) {
                eatery_vote[i][0] = eatery_array[i];
                eatery_vote[i][1] = String.valueOf(votes_array[i]);
            }
            Arrays.sort(eatery_vote, (ev_a, ev_b) -> Integer.compare(Integer.parseInt(ev_b[1]), Integer.parseInt(ev_a[1])));
            for (int i = 0; i < 10; i++) {
                System.out.println(eatery_vote[i][0] + ": " + eatery_vote[i][1]);
            }
        }
        catch (Exception e) {
            System.err.println("problem loading data");
            e.printStackTrace();
        }
    }
}
