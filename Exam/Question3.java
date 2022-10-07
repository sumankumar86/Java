import java.util.*;

public class Question3 {

    static int times = 0;

    public static void main(String args[]) {

        ArrayList<String> city = new ArrayList<String>();
        city.add("Kolkata");
        city.add("Mumbai");
        city.add("Mumbai");
        city.add("Burdwan");

        for (int i = 0; i < city.size(); i++) {
            if (city.get(i) == "Mumbai") {
                city.set(i, "Delhi");
            }
        }
        for (int j = 0; j < city.size(); j++) {
            if (city.get(j) == "Delhi") {
                times++;
            }

        }
        System.out.println(times);

    }
}
