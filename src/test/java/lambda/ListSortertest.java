package lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kasia on 27/09/2015.
 */
public class ListSorterTest {

    @Test
    public void checkSortingByComparator() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        List<String> sortingNames = Arrays.asList("xenia", "peter", "mike", "anna");
        new ListSorter().sortByComparator(names);
        assertEquals(names, sortingNames);
    }

    @Test
    public void checkSortingByLambda() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        List<String> sortingNames = Arrays.asList("xenia", "peter", "mike", "anna");
        new ListSorter().sortByLambda(names);
        assertEquals(names, sortingNames);
    }
}
