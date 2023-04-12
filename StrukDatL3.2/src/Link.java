public class Link {
    public Object dData;
    public Link next;

    public Link(Object dd){
        dData = dd;
    }

    public void show(){
        System.out.print(dData + " ");
    }
}