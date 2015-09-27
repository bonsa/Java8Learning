package lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kasia on 27/09/2015.
 */
public class ListSorter {

    public void sortByComparator(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

    }

    public void sortByLambda(List<String> list) {
        Collections.sort(list, (a, b) -> b.compareTo(a));
    }


}
