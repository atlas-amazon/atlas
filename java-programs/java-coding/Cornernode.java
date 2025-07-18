import java.util.*;

public class CornerNodePrinter {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void printCornerNodes(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                if (i == 0 || i == levelSize - 1) {
                    System.out.print(current.val + " ");
                }

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(15);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(11);
        root.right.right.left = new TreeNode(12);
        root.right.right.right = new TreeNode(14);

        System.out.println("Corner nodes of each level:");
        printCornerNodes(root);
    }