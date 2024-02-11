
 
 
class Main {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // The depth of an empty tree is 0.
        } else {
            // Calculate the depth of the left and right subtrees.
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            // Return the maximum depth of the two subtrees plus 1 for the current node.
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        // Creating a sample binary tree: 1
        //                              / \
        //                             2   3
        //                                / \
        //                               4   5

        TreeNode root = new TreeNode(1,
            new TreeNode(2),
            new TreeNode(3,
                new TreeNode(4),
                new TreeNode(5)
            )
        );

        Main solution = new Main();
        int maxDepth = solution.maxDepth(root);

        System.out.println("Maximum Depth of the Binary Tree: " + maxDepth);
    }
}
