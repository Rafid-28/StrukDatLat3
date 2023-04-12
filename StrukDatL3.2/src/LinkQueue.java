public class LinkQueue {
    public FirstLastList thelist;
    public LinkQueue(){
        thelist = new FirstLastList();
    }
    public boolean empty(){
        return thelist.empty();
    }
    public void enqueue (String j){
        thelist.insertLast(j);
    }
    public String dequeue(){
        return thelist.delete();
    }
    public void displayQueue(){
        System.out.println("Queue (head ==> tail) : ");
        thelist.displayList();
    }
    public void displayFirst(){
        thelist.showFirst();
    }
}
