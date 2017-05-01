import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ParsePostTest {
    @Test
    public void doParse() throws Exception {
        ArrayList<String> result2 = new ArrayList<>();
        result2.add("2");
        result2.add("3.5");
        result2.add("4");
        result2.add("+");
        result2.add("*");
        ParsePost parsePost = new ParsePost(result2);
        assertThat(parsePost.doParse(), is(15.0));
    }
}