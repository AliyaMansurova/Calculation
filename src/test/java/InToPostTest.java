
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InToPostTest {
    @Test
    public void gotOperTest() {
        ArrayList<String> result1 = new ArrayList<>();
        result1.add("2");
        result1.add("+");
        result1.add("3");
        result1.add("*");
        result1.add("4");
        InToPost inToPost = new InToPost(result1);
        inToPost.getTheStack().push("+");
        inToPost.gotOper("*", 2);
        assertThat(inToPost.getTheStack().pop(), is("*"));
        assertThat(inToPost.getTheStack().pop(), is("+"));
    }

    @Test
    public void gotParenTest() {
        ArrayList<String> result1 = new ArrayList<>();
        result1.add("2");
        result1.add("*");
        result1.add("(");
        result1.add("3");
        result1.add("+");
        result1.add("4");
        result1.add(")");
        InToPost inToPost = new InToPost(result1);
        inToPost.gotOper("*", 2);
        inToPost.getTheStack().push("(");
        inToPost.gotOper("+", 1);
        inToPost.gotOper("/", 2);
        inToPost.gotParen(")");
        ArrayList<String> result2 = new ArrayList<>();
        result2.add("/");
        result2.add("+");
        assertArrayEquals(inToPost.getOutput().toArray(), result2.toArray());
    }

    @Test
    public void doTransTest() {
        ArrayList<String> result1 = new ArrayList<>();
        result1.add("2");
        result1.add("*");
        result1.add("(");
        result1.add("3");
        result1.add("+");
        result1.add("4");
        result1.add(")");
        InToPost inToPost = new InToPost(result1);
        inToPost.doTrans();
        ArrayList<String> result2 = new ArrayList<>();
        result2.add("2");
        result2.add("3");
        result2.add("4");
        result2.add("+");
        result2.add("*");
        assertArrayEquals(inToPost.getOutput().toArray(), result2.toArray());
    }
}
