package First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "cars";
		String s2 = "arsc";
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
//		System.out.println(arr1);
//		System.out.println(arr2);
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		
		boolean result=Arrays.equals(arr1, arr2);
		if(result) 
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
		
		
		

	}

}
