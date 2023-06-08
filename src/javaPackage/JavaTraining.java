package javaPackage;

import java.util.*;

public class JavaTraining {
	public static void main(String[] args) {
		
		System.out.println("pgrm to find the no of occurance of each character in a string");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] s1= s.toCharArray();
		int count=0;
		Map<Character,Integer> map= new HashMap<>();
		
		for(int i=0;i<s1.length;i++) {
			count=0;
			for(int j=0;j<s1.length;j++)
			{
				if(s1[i]==s1[j])
				{
					count++;
				}
			}
			map.put(s1[i], count);
		}
		System.out.println(map);
		
		
		
	}

}
//	public static void main(String[] args) {
//		
//	
//	
//	Scanner sc = new Scanner(System.in);
//	String s=sc.nextLine();
//	char[] s1=s.toCharArray();
//	int count=0;
//	
//	Map <Character,Integer>map = new TreeMap<>() ;
//	
//	for(int i=0;i<s1.length;i++)
//	{	count=0;	
//		for(int j=0;j<s1.length;j++)
//		{
//			
//			if(s1[i]==s1[j])
//			{
//				count++;
//			}
//		}
//		map.put(s1[i], count);
//	}
//	System.out.println(map);
//	
//
//}

