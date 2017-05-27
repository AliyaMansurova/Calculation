import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void factorial() throws Exception {
       assertThat(Factorial.factorial(2),is (2));
       assertThat(Factorial.factorial(3),is(6));
        assertThat(Factorial.factorial(4),is(24));
            }

}