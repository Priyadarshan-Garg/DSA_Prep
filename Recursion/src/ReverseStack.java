import java.util.Stack;

public class ReverseStack {
    // Approach 1 : T --> O(N) and S-->O(N) le rha hai
    public static Stack<Integer> rev = new Stack<>();
    public static Stack<Integer> Function(Stack<Integer> stack){
        if(stack.isEmpty()){
            return rev;
        }
        rev.push(stack.peek());
        stack.pop();
        return Function(stack);

    }
    // Approach 2 : S-->O(1)
    public static void Function2(Stack<Integer> st){
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        Function2(st);
        insertAtBottom(st, top);

    }

    private static void insertAtBottom(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, item);
        st.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println((st));
        Function2(st);
        System.out.println(st);
    }
}
