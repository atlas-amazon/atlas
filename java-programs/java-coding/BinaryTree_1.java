class TreeNode {
    int item;
    TreeNode left, right;
 
    TreeNode(int item) {
        item = item;
        left = right = null;
    }
}
class BinarySearchTreeOp02 {
    TreeNode root;
 
    public BinarySearchTreeOp02() {
        this.root = null;
    }
 
    public TreeNode search(int key) {
        TreeNode current = root;
        while (current != null) {		//	key 30    current 50 == root
            if (key == current.item) {
                return current; 
            } else if (key < current.item) {		//	key 80    current 50 == root
                current = current.left; 
            } else {
                current = current.right;
            }
        }
        return null; 
    }
}