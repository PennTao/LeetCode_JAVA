package zigzagleveltrav;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import common.TreeNode;

public class TestZigzagTrav {

	@Test
	public void test() {
		TreeNode root = new TreeNode(1);
		Solution sol = new Solution();
		ArrayList<ArrayList<Integer>> res = sol.zigzagLevelOrder(root);
		ArrayList<ArrayList<Integer>> cmp = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		cmp.add(a);
		assertEquals(cmp, res);
	}

}
