public class MainQueue {

    public static void main(String[] args) {
        LinkQueue lq = new LinkQueue();
        lq.enqueue("Java");
        lq.enqueue("DotNet");
        lq.enqueue("PHP");
        lq.enqueue("HTML");
        System.out.println("Remove  : "+ lq.dequeue());
        System.out.println("Element : ");
        lq.displayFirst();
        System.out.println("Poll : "+ lq.dequeue());
        System.out.println("Peek : ");
        lq.displayFirst();
    }
}