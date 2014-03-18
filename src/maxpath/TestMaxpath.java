package maxpath;

import static org.junit.Assert.*;

import org.junit.Test;

import common.TreeNode;

public class TestMaxpath {

	@Test
	public void test() {
		Solution sol = new Solution();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		assertEquals(6, sol.GetMax(root));
		root.left.left = new TreeNode(-100);
		root.left.left.right= new TreeNode(1000);
		assertEquals(1000, sol.GetMax(root));
		
		Solution sol2 = new Solution();
		TreeNode root2 = new TreeNode(-2);
		assertEquals(-2, sol2.GetMax(root2));
	}

}
