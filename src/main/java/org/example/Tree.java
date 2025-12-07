package org.example;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Tree {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        int left = 0;
        int right = 0;

        if (root != null) {
            if (root.left != null) {
                left = maxDepthLeft(root.left, 2);
            }

            if (root.right != null) {
                right = maxDepthRight(root.right, 2);
            }
        }

        return (left > right) ? left : right;
    }

    private int maxDepthLeft(TreeNode root, int result) {
        if (root.left != null) {
            return maxDepthLeft(root.left, result++);
        }
        return result;
    }

    private int maxDepthRight(TreeNode root, int result) {
        if (root.right != null) {
            return maxDepthRight(root.right, result++);
        }
        return result;
    }

}
