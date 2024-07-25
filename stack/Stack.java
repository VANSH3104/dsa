package dsa.stack;

public class Stack {
    int stack[];
    int top;
    public Stack(int size){
        this.stack= new int[size];
        this.top=-1;
        System.out.println("stack is created");
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){
        if(top == stack.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int value){
        if(isFull()){
            System.out.println("stack is full");
        }
        else {
            stack[top+1]= value;
            top++;
            System.out.println("element is inserted");
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack(4);
        boolean a = stk.isEmpty();
        boolean b = stk.isFull();
        System.out.println("empty:"+a);
        System.out.println("full:"+b);
        stk.push(0);
        stk.push(0);
        stk.push(0);
        stk.push(0);
        stk.push(0);

    }
}
