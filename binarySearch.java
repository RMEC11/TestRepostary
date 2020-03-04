import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int arr[] = { 10, 20, 15, 22, 35,76,89,78,68,45,28,69,37,82,14,568,987 };
		Arrays.sort(arr);
		int key =69;
		int res = Arrays.binarySearch(arr, key);
		if(res>=0)
			System.out.println(key+" Found at index = " + res);
		else
			System.out.println(key+" Not found");
		key =123;
		res = Arrays.binarySearch(arr, key);
		if(res>=0)
			System.out.println(key+" Found at index = "+res);
		else
			System.out.println(key+" Not Found");*/
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(15);
		al.add(10);
		al.add(20);
		
		int key =10;
		int res = Collections.binarySearch(al, key);
		if(res>=0)
			System.out.println(key + " Found at index = " + res);
		else
			System.out.println(key + " Not Found");
		key = 15;
		res = Collections.binarySearch(al, key);
		if(res>=0)
			System.out.println(key+ " Found at index = " +res);
		else
			System.out.println(key + " Not Found");
	}

}
