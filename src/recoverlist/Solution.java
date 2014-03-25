package recoverlist;
import java.util.Iterator;
import java.util.LinkedList;

import common.TreeNode;
public class Solution {
    LinkedList<TreeNode> lst = new LinkedList<TreeNode>();
    int temp;
    public void recoverTree(TreeNode root) {
        
    }
    public void treeTrav(TreeNode root){
        if(root == null){
            return ;
        }
        else{
            treeTrav(root.left);
            if(lst.size()>1 && lst.getLast().val>root.val){
                temp = lst.getLast().val;
            }
            lst.add(root);
            treeTrav(root.right);
        }
    }
    public void sortList(){
        Iterator<TreeNode> itr = lst.listIterator(0);
        while(itr.hasNext()){
        	
        }
    }
}