package ferreira;

import java.util.NoSuchElementException;

public class ArrayQueue {

    /**
     * Array to hold the data
     * front to point to the index of the first element
     * back to point to the index of the last element
     */
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    /**
     * Takes an eploye and add to the end of the Queue
     * @param employee
     */
    public void add(Employee employee) {
        if (back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    /**
     * Remove increment the front so it does no longer points to the that element in
     * the front and now the second element is the first since front was incremented
     * then null the slot where the element was referred
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
        return back - front;
    }

    /**
     * Just to print the Queue
     */
    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
