package ferreira;

/**
 * A class that will implement the three holding the root node
 * This implementation does not implement duplicate values
 */
public class Tree {

    //The fist item of the three
    private TreeNode root;

    /**
     * Get the value and call the insertion in the ThreeNode
     * @param value
     */
    public void insert(int value) {

        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.threeNodeinsert(value);
        }
    }

    /**
     * This methods use the ThreeNode  get(value) to return an object node
     * of the given value
     * @param value
     * @return node of the value or null if its not found
     */
    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    /**
     *
     * @param value
     */
    public void delete(int value) {
        root = delete(root, value);
    }

    /**
     * Delete the root and use recursion to set the proper substitution for
     * the node deleted
     */
    private TreeNode delete(TreeNode subTreeRoot, int value) {
        //Stop the recursion eventually
        if (subTreeRoot == null) {
            return subTreeRoot;
        }

        if (value < subTreeRoot.getNumber()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        }
        else if (value > subTreeRoot.getNumber()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        }
        else {
            if (subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            }
            else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }
        }

        return subTreeRoot;
    }

    /**
     * Get the min value. Logic in the ThreeNode
     * @return min value
     */
    public int min() {
        if(root == null){
            System.out.println("Error: Empty Three");
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    /**
     * Get the max value. Logic in the ThreeNode
     * @return max value
     */
    public int max() {
        if(root == null){
            System.out.println("Error: Empty Three");
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }

    /**
     * Start the traversing the three with the root
     */
    public void tranversingInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

}
