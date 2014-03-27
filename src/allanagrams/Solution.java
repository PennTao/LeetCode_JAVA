package allanagrams;

import java.util.LinkedList;


public class Solution {
	
	
	public LinkedList<String> GetAllAnagrams(String str)
	{
		
		if(str.length() == 0){
			return new LinkedList<String>();
		}
		
		LinkedList<String> lres = GetAllAnagrams(str.substring(1));
		LinkedList<String> res = new LinkedList<String>();
		if(lres.size() == 0){
			lres.add(str);
			return lres;
		}
		else{
			for(String ana : lres){
				for(int i = 0; i < ana.length(); i++){
					String newStr = ana.substring(0,i)+str.substring(0, 1) + ana.substring(i, ana.length());
					if(!res.contains(newStr)){
					
						res.add(newStr);
					}
					
				}
				if(!res.contains(ana + str.substring(0, 1)))
				{
					res.add(ana + str.substring(0, 1));
				}
			}
			return res;
		}
	}
}
