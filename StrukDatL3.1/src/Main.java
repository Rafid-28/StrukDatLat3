

public class Main{
    public static void main(String[] args) {
        Stack st = new Stack(5);
        
        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");
        
        System.out.println("Next : " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push(":");
        
        int count = 0;
        Object value = "";
        while (!st.isEmpty() && count != -1) {
            value = st.pop();
            count = (value.equals("Aku")) ? count + 1 : count;
        }
        System.out.println(value);
        System.out.println(st.isEmpty());
    }
}