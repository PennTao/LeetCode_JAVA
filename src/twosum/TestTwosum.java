package twosum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwosum {

	@Test
	public void test() {
		Solution sol = new Solution();
		int[] a = {1};
		int[] b = {};
		int[] c = {1,2};
		int[] d = {1,345,51,61,15,5,61,4,6,78};
		int[] res = {3,6};

		assertNull(sol.twoSum(a, 0));	
		assertNull(sol.twoSum(b, 0));	
		assertArrayEquals(res,sol.twoSum(d, 56));	
		
		assertNull(sol.twoSum(c, 1));
		
		assertNull(sol.twoSum(d,999));
	}

}
