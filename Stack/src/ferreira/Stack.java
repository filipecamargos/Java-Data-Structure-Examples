package ferreira;

import java.util.EmptyStackException;

public class Stack {

    //Underline data
    private Employee[] stack;
    private int top = 0;

    //Constructor
    public Stack(int capacity){
        stack = new Employee[capacity];
    }

    //Push a employe into the stack
    public void push(Employee employee){
        //If stack is full we resize it
        if (top == stack.length){
            Employee[] resizedStack = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, resizedStack, 0, stack.length);
            stack = resizedStack;
        }

        stack[top++] = employee;
    }

    //Pop a value out of the stack
    public Employee pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        return employee;
    }

    //Pick the item on the top
    public Employee pick() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    //Return the size
    public int size(){
        return top;
    }

    //Print Stack
    public void printStack() {
        System.out.print("Top -> ");
        for (int i = top - 1; i >= 0; i--){
            System.out.print(stack[i] + " -> ");
        }
    }
    //Check if it is empty
    public boolean isEmpty() {
        return top == 0;
    }

}
