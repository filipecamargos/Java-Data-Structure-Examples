package ferreira;

public class EmployeeDoublyLinkedList {
    /**
     * An example of a Singly Linked List for employees
     */

    //The head of the linked list
    private EmployeeNode head;
    private EmployeeNode tail;

    //Keep track of how many items
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        node.setNext(head); //(Node) -> (Reference to what is in the head)

        if(isEmpty()) {
            tail = node; //If it is empty the first item is the tail and it goes as it grows
        }
        else {
            head.setPrevious(node); // (Node) <- (Reference to what is in the head)
        }

        head = node; //Now the node is the head and points next to the head and head pint previous to the node
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if(isEmpty()) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size ++;
    }

    //Takes and employee and add before the employeePlace
    public boolean addBefore(Employee employeePlace, Employee employee){

        if (isEmpty()) {
            return false;
        }

        EmployeeNode toBeAdded = new EmployeeNode(employee);
        EmployeeNode current = head;

        //Find the employee
        while(current != null){
            if(current.getEmployee().equals(employeePlace)) {
                EmployeeNode previousCurrent = current.getPrevious();
                previousCurrent.setNext(toBeAdded);
                toBeAdded.setPrevious(previousCurrent);
                toBeAdded.setNext(current);
                current.setPrevious(toBeAdded);

                size ++;
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    //Remove an node from the front
    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        //If are removing from the fron the next becomes the head therefore starts point
        //to null toward the left
        if (head.getNext() == null) {
            tail = null; //If this is the only item tails should be null when it is removed
        }
        else {
            //Since the next is the new head it now point to previous as null
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);

        return removedNode;
    }

    //Remove an node from the back
    public EmployeeNode removeFromEnd() {
        if (isEmpty()){
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
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
            System.out.print( current + " <=> ");
            current = current.getNext();
        }
        System.out.print(" Tail <- null");
    }
}
