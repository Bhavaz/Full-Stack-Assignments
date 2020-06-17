import java.util.*;

public class WordCount {
	public void count(String str)
	{
		char c[]=str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i =0; i< c.length;i++) {
			if(!hm.containsKey(c[i])) {
				hm.put(c[i],1);
			}
			else
			{
				hm.put(c[i],hm.get(c[i])+1);
			}
		}
		System.out.println(hm);
		
	}
		
		
		
		
		
}
