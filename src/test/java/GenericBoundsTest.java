import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.hasItem;

public class GenericBoundsTest {
    @Test
    public void genericBoundsForAnyOfAreTransitive() {
        List<String> list = new ArrayList<>();
        list.add("b");
        assertThat(list, anyOf(hasItem("a"), hasItem("b")));
    }
}
