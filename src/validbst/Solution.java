/*Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
*/
package validbst;

import java.util.Iterator;
import java.util.LinkedList;

import common.TreeNode;

public class Solution {
    LinkedList<Integer> lst = new LinkedList<Integer>();
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        treeTrav(root);
        Iterator<Integer> itr1 = lst.listIterator(0);
        Iterator<Integer> itr2 = lst.listIterator(1);
        while(itr2.hasNext()){
            if(itr2.next() <=itr1.next()){
                return false;
            }
        }
        return true;
    }
    public void treeTrav(TreeNode root){
        if(root == null){
            return;
        }
        else{
            treeTrav(root.left);
            lst.add(root.val);
            treeTrav(root.right);
        }
    }
}
