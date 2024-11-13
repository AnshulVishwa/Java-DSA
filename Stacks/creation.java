class Stack{
    int arr[];
    private int top;
    private int maxSize;
    Stack( int size ){
        arr = new int[size];
        top = -1;
        maxSize = size;
        System.out.println(arr.length);
    }
    void push( int val ){
        if( isFull() ){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = val;
    } 
    void pop(){
        if( isEmpty() ){
            System.out.println("Stack underflow");
            return;
        }
        arr[top--] = 0;
    }
    void peek(){
        if( isEmpty() ){
            System.out.println("No element");
            return;
        }
        System.out.println("Top element : " + arr[top]);
    }
    void display(){
        if( isEmpty() ){
            System.out.println("Stack empty");
            return;
        }
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
        System.out.println();
    }
    private boolean isEmpty() {
        return (top == -1);
    }

    private boolean isFull() {
        return (top == maxSize - 1);
    }
}
public class creation{
    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.push(40);
        newStack.push(50);

        newStack.pop();
        newStack.peek();

        newStack.display();
    }
}