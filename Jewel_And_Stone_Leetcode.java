import java.util.HashMap;
import java.util.HashMap;

public class Jewel_And_Stone_Leetcode {
	public static  int numJewelsInStones(String J, String S) {
		int count = 0;

		HashMap<Character,Integer> set= new HashMap<Character,Integer>();

		for(int i =0;i<S.length();i++)
		{
			int value = set.getOrDefault(S.charAt(i), 0);
			set.put(S.charAt(i), value+1);
		}

		for(int i = 0;i<J.length();i++)
		{
			int jewelCount = set.getOrDefault(J.charAt(i),0);
			count = count + jewelCount;
		}
		return count;

	}
	
	public static void main(String args[])
	{
		int jewels = numJewelsInStones("z", "ZZ");
		
		System.out.print(jewels);
	}
}
