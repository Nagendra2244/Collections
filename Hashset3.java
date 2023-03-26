//hashset program 3
import java.util.*;

public class Hashset3 {
    public static void main(String args[]) {
        // Creating Hash Set and Adding Elements
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Rajesh");
        set.add("Ravi");
        set.add("Srinivas");
        set.remove("Rajesh");

        System.out.println(set.contains("Rajesh"));

        // Traversing Elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
