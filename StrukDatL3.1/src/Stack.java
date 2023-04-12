public class Stack{
    private int maxSize;
    private Object[] stackArray;
    private int top;
    
    public Stack(int s){
        maxSize = s;
        stackArray = new Object[maxSize];
        top = -1;
    }
    public void push(Object j){
        stackArray[++top] = j;
    }
    public Object pop(){
        return stackArray[top--];
    }
    public Object peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize-1);
    }
}