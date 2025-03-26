public class CustomStack {
    protected int [] arr;
    int ptr = -1;
    private static final int DEFAULT_SIZE = 10;
   protected CustomStack(){
       this.arr = new int [DEFAULT_SIZE];
   }
   protected CustomStack(int length){
       this.arr = new int[length];
   }
   public boolean push(int data){
       ptr++;
       if(isFull() ){
           return false;
       }
       arr[ptr] = data;
       return true;
   }
   public int pop()throws Exception{
       if(isEmpty()){
           throw new Exception("Can't delete from empty Stack");
       }
       return arr[ptr--];
   }
   public int peek() throws Exception{
       // top of the stack's value;
       if (isEmpty()){
           throw new Exception("Can't Peek cuz stack is Empty");
       }
       return arr[ptr];
   }
   public boolean isFull(){
       return ptr == arr.length-1;
   }
    public boolean isEmpty(){
        return ptr == -1;
    }

    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack(3);
        stack.push(1);
        stack.push(14);
        stack.push(13);
//        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
