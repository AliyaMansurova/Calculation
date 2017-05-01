import java.util.List;

class ParsePost {
    private StackX theStack;
    private List<String> input;

    public ParsePost(List<String> s) {
        input = s;
    }

    public double doParse() {
        theStack = new StackX(input.size());
        double interAns;
        for(int j = 0; j < input.size(); ++j) {
            String ch = input.get(j);
            if((!ch.equals("+"))&&(!ch.equals("-"))&&(!ch.equals("*"))&&(!ch.equals("/"))) {
                theStack.push(ch);
            } else {
                double num2 =Double.parseDouble(theStack.pop());
                double num1 =Double.parseDouble(theStack.pop());
                switch(ch) {
                    case "*":
                        interAns = num1 * num2;
                        break;
                    case "+":
                        interAns = num1 + num2;
                        break;
                    default:
                        interAns = 0;
                        break;
                    case "-":
                        interAns = num1 - num2;
                        break;
                    case "/":
                        interAns = num1 / num2;
                }
                this.theStack.push(Double.toString(interAns));
            }
        }
        interAns = Double.parseDouble(theStack.pop());
        return interAns;
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
}
