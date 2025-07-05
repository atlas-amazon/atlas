public class BinarySearchTree {
   
   static class TreeNode {
        int value;
        TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            System.out.println("Inserted " + value + " as root node.");
        } else {
            insertRecursively(root, value);
        }
    }

    private void insertRecursively(TreeNode current, int value) {
        if (value < current.value) {
            if (current.left == null) {
                current.left = new TreeNode(value);
                System.out.println("Inserted " + value + " to the left of " + current.value);
            } else {
                insertRecursively(current.left, value);
            }
        } else if (value > current.value) {
            if (current.right == null) {
                current.right = new TreeNode(value);
                System.out.println("Inserted " + value + " to the right of " + current.value);
            } else {
                insertRecursively(current.right, value);
            }
        } else {
            System.out.println("Value " + value + " already exists. No duplicates allowed.");
        }
    }

   
    public void inOrderTraversal() {
        System.out.print("In-order traversal: ");
        inOrderHelper(root);
        System.out.println();
    }

    private void inOrderHelper(TreeNode node) {
        if (node != null) {
            inOrderHelper(node.left);
            System.out.print(node.value + " ");
            inOrderHelper(node.right);
        }
    }

    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(7);
        bst.insert(5); 

        bst.inOrderTraversal(); 
    }
}