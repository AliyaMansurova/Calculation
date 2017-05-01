import java.util.ArrayList;
import java.util.List;

public class InToPost {
    private StackX theStack;
    // private String input;
    //private String output = "";
    private List<String> input;
    private List<String> output;

    public InToPost(List<String> in) {
        input = in;
        int stackSize = input.size();
        theStack = new StackX(stackSize);
        output=new ArrayList<>();
    }

    // Преобразование в постфиксную форму
    public List<String> doTrans() {
        {
            for (int j = 0; j < input.size(); j++) {
                //char ch = input.charAt(j);
                String ch = input.get(j);
                switch (ch) {
                    case "+":
                    case "-":
                        gotOper(ch, 1);
                        break;
                    case "*":
                    case "/":
                        gotOper(ch, 2);
                        break;
                    case "(":
                        theStack.push(ch);
                        break;
                    case ")":
                        gotParen(ch);
                        break;
                    default:
                        output.add(ch);
                        break;
                }
            }

            while (!theStack.isEmpty()) {
                output.add(theStack.pop());
            }
            return output;
        }
    }

    public void gotOper(String opThis, int prec1) {
        while (!theStack.isEmpty()) {
            String opTop = theStack.pop();//последний элемент стека
            if (opTop.equals("(")) {
                theStack.push(opTop);
                break;
            } else {
                int prec2;//приоритет последнего операнда
                if (opTop.equals("+") || opTop.equals("-"))
                    prec2 = 1;
                else
                    prec2 = 2;
                //если приоритет старого меньше приоритета нового
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else
                    output.add(opTop);
            }
        }
        theStack.push(opThis);
    }

    public void gotParen(String ch) {
        while (!theStack.isEmpty()) {
            String chx = theStack.pop();
            if (chx.equals("("))
                break;
            else
                output.add(chx);
        }
    }

    public StackX getTheStack() {
        return theStack;
    }

    public void setTheStack(StackX theStack) {
        this.theStack = theStack;
    }

    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public List<String> getOutput() {
        return output;
    }

    public void setOutput(List<String> output) {
        this.output = output;
    }
}
