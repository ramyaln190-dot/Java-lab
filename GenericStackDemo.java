import java.util.ArrayList;
import java.util.EmptyStackException;

class GenericStack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
        System.out.println("Pushed: " + item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack: " + stack);
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {

        GenericStack<Integer> s = new GenericStack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());

        s.display();

        System.out.println("Is stack empty? " + s.isEmpty());
    }
}
