package maxpath;

import common.TreeNode;

public class Solution {
	int max = -Integer.MAX_VALUE;
	public int GetMaxHelper(TreeNode root){
		if(root == null)
		{
			return 0;
		}
		else{
			int left = GetMaxHelper(root.left);
			int right = GetMaxHelper(root.right);
			int m = Math.max(left,right) + root.val;
			if (left+right+root.val > max){
				max = left+right+root.val;
			}
			if(m >= 0){
				return m;
			}
			else{
				return 0;
			}
		}
	}
	public int GetMax(TreeNode root){
		GetMaxHelper(root);
		return max;
		
	}

}
