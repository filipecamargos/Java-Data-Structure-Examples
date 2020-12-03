package ferreira;

import java.util.NoSuchElementException;

public class CircularQueue {

    /**
     * Array to hold the data
     * front to point to the index of the first element
     * back to point to the index of the last element
     */
    private Employee[] queue;
    private int front;
    private int back;

    public CircularQueue(int capacity) {
        queue = new Employee[capacity];
    }

    /**
     * Takes an employee and add to the end of the Queue
     * @param employee
     */
    public void add(Employee employee) {

        if (size() == queue.length) {
            int items = size();
            Employee[] newArray = new Employee[2 * queue.length];

            //Copy the array unwrapping it
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back );

            queue = newArray;
            front = 0;
            back = items;
        }

        queue[back] = employee;

        //Check if the array still have space if not will use the front of it
        if (back < queue.length - 1){
            back++;
        } else {
            back = 0;
        }
    }

    /**
     * Remove an element from the front of the queue
     * @return the object that was nulled and is not longer the first
     */
    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }

        return employee;
    }

    /**
     * @return the first element
     */
    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    /**
     * The front and the back are constantly changing so it the difference is the size
     * @return size
     */
    public int size() {
        if(front <= back) {
            return back - front;
        }
        else {
            return back - front + queue.length;
        }

    }

    /**
     * Just to print the Queue
     */
    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }


    }

}
