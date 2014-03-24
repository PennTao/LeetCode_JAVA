/*Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]*/
package zigzagleveltrav;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import common.TreeNode;

public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer, ArrayList<Integer>> mRec = zigzagLevelHelper(root);
        for(int i = 0; i< mRec.size();i++){
        	res.add(mRec.get(i));
        }
        return res;
    }
    public HashMap<Integer, ArrayList<Integer>> zigzagLevelHelper(TreeNode root){
        HashMap<Integer, ArrayList<Integer>> res = new HashMap<Integer, ArrayList<Integer>>();
        if(root == null){
            return res;
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Queue<Integer> levelq = new LinkedList<Integer>();
        TreeNode curNode;
        Integer curLevel;
        q.add(root);
        levelq.add(0);
        while(!q.isEmpty()){
            curNode = q.poll();
            curLevel = levelq.poll();
            if(!res.containsKey(curLevel)){
                res.put(curLevel, new ArrayList<Integer>());
                res.get(curLevel).add(curNode.val);
            }
            else{
                if(curLevel%2 == 0){
                	res.get(curLevel).add(curNode.val);
                }
                else{
                	res.get(curLevel).add(0, curNode.val);
                }
            }
            if(curNode.left != null){
                q.add(curNode.left);
                levelq.add(curLevel +1);
            }
            if(curNode.right != null){
                q.add(curNode.right);
                levelq.add(curLevel+1);
            }          
        }
        return res;
    }
}
