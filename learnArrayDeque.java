import java.util.ArrayDeque;

public class learnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offerFirst(24);
        adq.offerLast(36);
        adq.offer(48);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll()" + adq);

               System.out.println(adq.pollLast());
        System.out.println("poll()" + adq);
    }
}
