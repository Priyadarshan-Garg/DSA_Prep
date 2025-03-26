public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int length) {
        super(length);
    }
    @Override
    public boolean push(int data){
        if (isFull()) {
        int [] temp = new int[arr.length*2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        }
        return super.push(data);
    }
}
