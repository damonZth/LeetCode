/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/invert-binary-tree/#/description
 *
 * Invert a binary tree.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }

        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public TreeNode inverTree_1(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        if(root.left != null){
            leftNode = inverTree_1(root.left);
        }

        if(root.right != null){
            rightNode = inverTree_1(root.right);
        }

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }
}
