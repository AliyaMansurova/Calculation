import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StackXTest {
    StackX stack=new StackX(3);
    @Test
    public void pushTest(){
        stack.push('1');
        assertThat(stack.getMaxSize(),is(3));
        assertThat(stack.getTop(),is(0));
    }
    @Test
    public void popTest(){
        stack.push('1');
        assertThat(stack.pop(),is('1'));
    }
    @Test
    public void peekTest(){
        stack.push('1');
        assertThat(stack.peek(),is('1'));
    }
    @Test
    public void isEmptyTest(){
        assertThat(stack.isEmpty(),is(true));
    }
    @Test
    public void isFullTest(){
        stack.push('1');
        stack.push('2');
        stack.push('3');
        assertThat(stack.isFull(),is(true));
    }
    @Test
    public void sizeTest(){
        stack.push('1');
        assertThat(stack.size(),is(1));
    }
    @Test
    public void peekNTest(){
        stack.push('1');
        stack.push('2');
        assertThat(stack.peekN(0),is('1'));
        assertThat(stack.peekN(1),is('2'));
    }

}