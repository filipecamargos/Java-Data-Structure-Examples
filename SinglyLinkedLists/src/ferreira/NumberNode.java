package ferreira;

public class NumberNode {
    /**
     * Implementation of a custom Number node
     */

    //Hold the data number and the nextNumber object linked
    private int number;
    private NumberNode nextNumber;


    public NumberNode(int number) {
        this.number =  number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public NumberNode getNextNumber() {
        return nextNumber;
    }

    public void setNextNumber(NumberNode nextNumber) {
        this.nextNumber = nextNumber;
    }

    @Override
    public String toString() {
        return this.number + " -> ";
    }
}
