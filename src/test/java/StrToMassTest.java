import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StrToMassTest {
@Test
public void MassTest(){
    String s="-2+3*4-(-45)";
    ArrayList<String> result1=new ArrayList<>();
    result1.add("0");
    result1.add("+");
    result1.add("-2");
    result1.add("+");
    result1.add("3");
    result1.add("*");
    result1.add("4");
    result1.add("-");
    result1.add("(");
    result1.add("-45");
    result1.add(")");
    assertThat(StrToMass.mass(s).size(),is(result1.size()));
   }
}