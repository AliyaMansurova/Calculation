import java.util.ArrayList;
import java.util.List;

public class StackX {
    private int maxSize;
    private List<String> stackArray;
    private int top;

    public StackX(int size) {
        maxSize = size;
        stackArray=new ArrayList<>(maxSize);
        top = -1;
    }

    public void push(String j) {
        stackArray.add(j);
        top++;
    }

    public String pop() {
        String element=stackArray.get(top);
        stackArray.remove(top);
                top--;
        return element;
    }

    public String peek() {
        return stackArray.get(top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }

    public String peekN(int n) {
        return stackArray.get(n);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<String> getStackArray() {
        return stackArray;
    }

    public void setStackArray(List<String> stackArray) {
        this.stackArray = stackArray;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

}
