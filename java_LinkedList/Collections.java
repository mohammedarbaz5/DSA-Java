import java.util.LinkedList;
public class Collections {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        //opeartions
        ll.addFirst(1);
        ll.addLast(2);
        ll.offer(3);
        ll.offerFirst(4);
        ll.offerLast(5);
        ll.push(6);

        System.out.println(ll);
        //Access / Retreival
        System.out.println(ll.get(4));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll.element());
        //Removal
        System.out.println(ll.remove());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll.poll());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll.pop());

        
    }
}