package ferreira;

/**
 * Simple node class to hold the data that will be used in our three
 */
public class TreeNode {
    /**
     * Data held in this node
     */
    private int number;
    private TreeNode leftChild;
    private TreeNode rightChild;

    /**
     * Simple constructor
     */
    public TreeNode(int data) {
        this.number = data;
    }

    /**
     * Insert method that allows to inset item into the Binary Three
     */
    public void threeNodeinsert(int value) {

        if(value == number) {
            return;
        }
        //Check for the left side
        if (value < number) {
            insertLeft(value);
        }
        //Check for the right side
        else {
            insertRight(value);
        }

    }

    /**
     * Find the value node that matches the number
     * @param value
     * @return the node correspondent to the value or null if its not found
     */
    public TreeNode get(int value) {
        if (value == number) {
            return this;
        }
        if (value < number){
            if (leftChild != null) {
                return leftChild.get(value);
            }
        }
        else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return  null;
    }

    /**
     * This method gets the min value by going all the way to the
     * last element of the left edges
     * @return lower value
     */
    public int min(){
        if (leftChild == null) {
            return number;
        }
        else {
            return leftChild.min();
        }
    }

    /**
     * This method gets the max value by going all the way to the
     * last element of the right edges
     * @return max value
     */
    public int max() {
        if (rightChild == null) {
            return number;
        }
        else {
            return rightChild.max();
        }
    }

    /**
     * This method will transverse in other words visit each node in order
     */
    public void traverseInOrder() {

        //Visit the left side
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }

        System.out.println("Value = " + number);

        //The right side
        if(rightChild != null) {
            rightChild.traverseInOrder();
        }

    }

    /**
     * Check the left side of the three to insert a value
     * @param value
     */
    private void insertLeft(int value) {

        if (leftChild == null) {
            leftChild = new TreeNode(value);
        }
        else {
            leftChild.threeNodeinsert(value);
        }
    }

    /**
     * Check the right side of the three to insert a value
     * @param value
     */
    private void insertRight(int value) {

        if (rightChild == null) {
            rightChild = new TreeNode(value);
        }
        else {
            rightChild.threeNodeinsert(value);
        }
    }

    //All Getters and Setters bellow
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
