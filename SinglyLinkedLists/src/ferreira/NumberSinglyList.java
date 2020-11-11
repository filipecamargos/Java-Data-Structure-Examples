package ferreira;

public class NumberSinglyList {
    //Given the head and the size
    private NumberNode head;
    private int size;

    //With no instantiation
    public NumberSinglyList() {
        head = null;
        size = 0;
    }

    //Set the head when the list is instantiated
    public NumberSinglyList(int number){
        head = new NumberNode(number);
        head.setNumber(number);
        size = 0;
    }

    //Return the size of the linkedlist
    public int getSize(){
        return size;
    }

    //Add a number to the list
    public void addNumber(int number) {
        //if the head is not instantiated it means the head is null by default
        //Set the number to the head and increase the size
        if (head == null){
            head = new NumberNode(number);
            size ++;
            return;
        }

        //Create a new number and move the head over and make the new number the head
        //Finally increase the size
        NumberNode newNumber = new NumberNode(number);
        newNumber.setNextNumber(head);
        head = newNumber;
        size ++;
    }

    //Check if the List is empty
    public boolean isEmpty() {
        //Return true if the size is 0 which mean to be empty
        return size == 0;
    }

    //Remove the number from the front list and return it
    public Integer removeFrontNumber(){
        //If is empty just return a null
        if (isEmpty()){ return null; }

        NumberNode numberRemoved = head;
        head = head.getNextNumber();
        numberRemoved.setNextNumber(null);

        return numberRemoved.getNumber();
    }

    //Print the number list
    public void printListNumber() {
        if(head == null) {
            return;
        }

        //Use a current number that will be printed
        NumberNode currentNumber = head;
        System.out.print("Head:" + currentNumber.getNumber() + " -> ");

        int elementsCount = size;

        //Take the number of elements and the next number is not null
        while(elementsCount > 0 && currentNumber.getNextNumber() != null) {
            currentNumber = currentNumber.getNextNumber();
            System.out.print(currentNumber.toString());
            elementsCount --;
        }
        System.out.print("null");
    }
}
