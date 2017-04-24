import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InToPostTest {
    @Test
    public void gotOperTest(){
        InToPost inToPost=new InToPost("2+3*4");
        inToPost.getTheStack().push('+');
        inToPost.gotOper('*',2);
        assertThat(inToPost.getTheStack().pop(),is('*'));
        assertThat(inToPost.getTheStack().pop(),is('+'));
    }
    @Test
    public void gotParenTest(){
        InToPost inToPost=new InToPost("2*(3+4)");
        inToPost.gotOper('*',2);
        inToPost.getTheStack().push('(');
        inToPost.gotOper('+',1);
        inToPost.gotParen(')');
        assertThat(inToPost.getOutput(),is("+"));
    }
    @Test
    public void doTransTest(){
        InToPost inToPost=new InToPost("2*(3+4)");
        assertThat(inToPost.doTrans(),is("234+*"));
        InToPost inToPost2=new InToPost("A*(B+C)-D/(E+F)");
        assertThat(inToPost2.doTrans(),is("ABC+*DEF+/-"));
    }
}