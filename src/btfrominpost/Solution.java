/*Given inorder and postorder traversal of a tree, construct the binary tree.*/

package btfrominpost;

import common.TreeNode;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0)
        {
            return null;
        }
        TreeNode res = buildTree(inorder, postorder,0, inorder.length -1,postorder.length - 1);
        return res;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder, int inbegin, int inend,int poend){
        if(inbegin > inend || poend < 0){
            return null;
        }
        int pos = 0;
        TreeNode root = new TreeNode(postorder[poend]);
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == root.val){
                pos = i;
                break;
            }
        }
        root.right = buildTree(inorder,postorder, pos+1, inend, poend -1);
        root.left = buildTree(inorder,postorder,inbegin,pos-1, poend-1-inend+pos);
        return root;
    }
}