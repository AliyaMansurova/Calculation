import java.util.ArrayList;
import java.util.List;

public class StrToMass {
    public static List<String> mass(String s) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        boolean f = false;

        for (int j = 0; j < s.length(); j++) {
            if ((s.charAt(j) == '+') || (s.charAt(j) == '-') || (s.charAt(j) == '*')
                    || (s.charAt(j) == '/') || (s.charAt(j) == '(') || (s.charAt(j) == ')')) {
                if (j > i) {
                    result.add(s.substring(i, j));
                    result.add(s.substring(j, j + 1));
                }
                i = j + 1;
            }
        }
        if (i < s.length()) {
            result.add(s.substring(i));
        }
        return result;
    }
}
