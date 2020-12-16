package ferreira;

public class Main {

    public static void main(String[] args) {

        //Create three and insert some values
        Tree numberTree = new Tree();
        numberTree.insert(23);
        numberTree.insert(15);
        numberTree.insert(7);
        numberTree.insert(50);
        numberTree.insert(31);
        numberTree.insert(25);
        numberTree.insert(33);

        //Call the tranverseInOrder Implementation and check if it is in order
        numberTree.tranversingInOrder();

        //Check our get value method
        System.out.println("Get the value of 23 and its sides = " + numberTree.get(23).getNumber() + " left = " +
                numberTree.get(23).getLeftChild().getNumber() + " right = " +
                numberTree.get(23).getRightChild().getNumber());

        //Check min and max methods
        System.out.println("Min = " + numberTree.min() + "\n" + "Max = " + numberTree.max());

        //Delete method
        numberTree.delete(23);

        //Print it again
        numberTree.tranversingInOrder();

    }
}
