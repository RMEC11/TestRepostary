package basic4;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num_array = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		String[] ch_array = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };

	System.out.println("Origional Array:-"+Arrays.toString(num_array));
	Arrays.sort(num_array);
	System.out.println("Sorted Array :- "+Arrays.toString(num_array));
	
	System.out.println("Original Array:- "+Arrays.toString(ch_array));
	Arrays.sort(ch_array);
	System.out.println("Sorted Array:- "+Arrays.toString(ch_array));
	}

}
