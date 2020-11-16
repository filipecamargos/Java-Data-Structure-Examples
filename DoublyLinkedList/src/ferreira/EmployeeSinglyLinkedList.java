package ferreira;

public class EmployeeSinglyLinkedList {
    /**
     * An example of a Singly Linked List for employees
     */

    //The head of the linked list
    private EmployeeNode head;

    //Keep track of how many items
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        //Since you will be adding to the front (head) will become the next
        node.setNext(head);
        //Then the Head becomes the new node
        head = node;
        size++;
    }

    //remove item
    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);

        return removedNode;
    }

    //get the size
    public int getSize() {
        return size;
    }

    //Is empty
    public boolean isEmpty() {
        return head == null;
    }
    //Print the items
    public void printList() {
        EmployeeNode current = head;
        System.out.print( " Head -> ");
        while(current != null) {
            System.out.print( current + " -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }
}
