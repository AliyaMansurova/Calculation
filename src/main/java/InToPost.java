
public class InToPost {
    private StackX theStack;
    private String input;
    private String output = "";

    public InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
    }

    // Преобразование в постфиксную форму
    public String doTrans() {
        {
            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                //theStack.displayStack("For "+ch+" ");
                switch (ch) {
                    case '+':
                    case '-':
                        gotOper(ch, 1);
                        break;
                    case '*':
                    case '/':
                        gotOper(ch, 2);
                        break;
                    case '(':
                        theStack.push(ch);
                        break;
                    case ')':
                        gotParen(ch);
                        break;
                    default:
                        output = output + ch;
                        break;
                }
            }

            while (!theStack.isEmpty()) {
                output = output + theStack.pop();
            }
            return output;
        }
    }

    public void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();//последний элемент стека
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;//приоритет последнего операнда
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                //если приоритет старого меньше приоритета нового
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else
                    output = output + opTop;
            }
        }

        theStack.push(opThis);
    }

    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }

    }

    public StackX getTheStack() {
        return theStack;
    }

    public void setTheStack(StackX theStack) {
        this.theStack = theStack;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
