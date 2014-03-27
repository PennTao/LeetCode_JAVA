package allanagrams;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class TestGetAllAnagrams {

	@Test
	public void test() {
		Solution sol = new Solution();
		String str1 = new String();
		String str2 = "a";
		String str3 = "aa";
		String str4 = "ab";
		String str5 = "abc";
		String str6 = "aab";
		LinkedList<String> res1 = new LinkedList<String>();
		assertEquals(res1, sol.GetAllAnagrams(str1));
		res1.add("a");
		assertEquals(res1,sol.GetAllAnagrams(str2));
		LinkedList<String> res3 =  new LinkedList<String>();
		res3.add("aa");
		assertEquals(res3,sol.GetAllAnagrams(str3));
		LinkedList<String> res4 =  new LinkedList<String>();
		res4.add("ab");
		res4.add("ba");
		assertEquals(res4,sol.GetAllAnagrams(str4));
		LinkedList<String> res5 = new LinkedList<String>();
		res5.add("abc");
		res5.add("bac");
		res5.add("bca");
		res5.add("acb");
		res5.add("cab");
		res5.add("cba");
		assertEquals(res5,sol.GetAllAnagrams(str5));
		LinkedList<String> res6 = new LinkedList<String>();
		res6.add("aab");
		res6.add("aba");
		res6.add("baa");
		assertEquals(res6,sol.GetAllAnagrams(str6));
		
		
	}

}
