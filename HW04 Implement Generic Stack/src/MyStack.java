import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * we create a generic MyStack Class
 *
 * @param <T>  a generic type, we can use like String, Double, Integer
 */
public class MyStack<T> {

    private ArrayList<T> arrayList;
    private int index;

    /**
     * Constructs a Stack object and initializes it,
     * use index as the num of stack
     *
     * when index = -1, repesent the stack object is null
     * when index = 0 or index > 0, repesent the num of elements
     * in stack is num + 1
     */
    public MyStack() {
        arrayList = new ArrayList<>();
        index = -1;
    }

    /**
     * push a element into stack
     * the action just functing on the top of the stack object
     *
     * @param element a generic type, like String, Double, Integer
     */
    public void push(T element) {
        arrayList.add(element);
        index ++;
    }


    /**
     * pop a element of stack
     * the size of stack minus 1, and index minus 1
     *
     * if index less than 0, repesent stack is null
     * we can not pop element, otherwise throw EmptyStackException
     */
    public T pop() {
        if (index < 0)
            throw new EmptyStackException();
        T t = arrayList.get(index);
        arrayList.remove(index);
        index --;
        return t;
    }

    /**
     * get the elemnet of the top of the stack
     *
     * if index less than 0, repesent stack is null
     *      * we can not get top element, otherwise throw EmptyStackException
     * @return the elemnet of the top of the stack
     */
    public T top() {
        if (index < 0)
            throw new EmptyStackException();
        return arrayList.get(index);
    }

    /**
     * when the field index equals -1, the stack is empty
     * when the field of index unequals -1, the stack has element
     *
     * @return stack is empty, true;
     *         stack is not empty, false
     */
    public boolean empty() {
        if (index > -1)
            return false;
        else
            return true;
    }

    /**
     * get the stack's element and a empty as a string
     * printf the string of stack to console
     *
     * @return the stack's element and a empty as a string
     *         formatted as shown
     */
    @Override
    public String toString() {
        String s = "";
        for (T e : arrayList) {
            s += e + " ";
            System.out.println(e + " ");
        }
        return s;
    }
}
