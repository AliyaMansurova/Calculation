import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StrToMass {
    public static List<String> mass(String s) {
        ArrayList<String> result = new ArrayList<>();
        /*Pattern patternOperaton = Pattern.compile("\\d");
        Pattern patternNum = Pattern.compile("[\\+\\-\\*\\/\\(\\)]");
        String[] massOperation = patternOperaton.split(s);
        String[] massNum = patternNum.split(s);
        for (int i = 0; i < massNum.length; i++) {
            if (!massNum[i].equals(""))
                result.add(massNum[i]);
            if ((i < massOperation.length) &&(!massOperation[i].equals("")))
                result.add(massOperation[i]);
            else break;
        }
        return result;
    }*/
        int index=0;
       /* index=s.indexOf('+');
        System.out.println(index);
        result.add("85");*/
        //System.out.print(s.length());

       while (index<s.length())
        {
            s=s.substring(index,s.indexOf('+'));
            result.add(s);
            index=s.indexOf('+');
            System.out.print(index);
            System.out.println(result);
           // s=s.substring(index);
        }
        return result;
    }

    public static void main(String[] args) {
        String s="2+3+4";
        System.out.print( StrToMass.mass(s));
    }
}
