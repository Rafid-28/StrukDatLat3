public class FirstLastList {
    public Link first;
    public Link last;

    public FirstLastList(){
        first = null;
        last = null;
    }
    public boolean empty(){
        return first == null;
    }
    public void insertLast(String dd){
        Link baru = new Link(dd);
        if(empty()){
            first = baru;
        }else {
            last.next = baru;
        }
        last = baru;
    }
    public String delete (){
        String temp = (String) first.dData;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }
    public void displayList(){
        Link current = first;
        while (current != null){
            current.show();
            current = current.next;
        }
        System.out.println(" ");
    }
    public void showFirst(){
        Link current = first;
        current.show();
    }
}