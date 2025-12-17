import java.util.Iterator;
import java.util.Stack;

public class StackBCF {
    public static void main(String[] args) {

        // Creating Stack
        Stack<Integer> stack = new Stack<>();

        // ===== Core Stack Operations =====

        // push()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After push: " + stack);

        // pop()
        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop: " + stack);

        // peek()
        System.out.println("Top element (peek): " + stack.peek());

        // empty()
        System.out.println("Is stack empty? " + stack.empty());

        // search() → 1-based position from top
        System.out.println("Position of 10: " + stack.search(10));

        // ===== Vector Inherited Methods =====

        // size()
        System.out.println("Size of stack: " + stack.size());

        // capacity()
        System.out.println("Capacity of stack: " + stack.capacity());

        // contains()
        System.out.println("Contains 20? " + stack.contains(20));

        // get()
        System.out.println("Element at index 0: " + stack.get(0));

        // set()
        stack.set(0, 100);
        System.out.println("After set(): " + stack);

        // firstElement() & lastElement()
        System.out.println("First element: " + stack.firstElement());
        System.out.println("Last element: " + stack.lastElement());

        // indexOf() & lastIndexOf()
        stack.push(20);
        System.out.println("First index of 20: " + stack.indexOf(20));
        System.out.println("Last index of 20: " + stack.lastIndexOf(20));

        // ===== Removal Operations =====

        // remove(Object)
        stack.remove(Integer.valueOf(20));
        System.out.println("After removing 20: " + stack);

        // remove(index)
        stack.remove(0);
        System.out.println("After removing index 0: " + stack);

        // ===== Iteration =====

        System.out.println("Iterating using Iterator:");
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // forEach()
        System.out.println("Iterating using forEach:");
        stack.forEach(System.out::println);

        // ===== Clear Stack =====

        // clear()
        stack.clear();
        System.out.println("After clear(): " + stack);
    }
}

