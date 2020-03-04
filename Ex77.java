package exam1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr1= {50, -20, 0};	
	int[] arr2= {5, -50, 10};
	int[] arr3= {10,56,12};
	System.out.println("Array1:- "+Arrays.toString(arr1));
	System.out.println("Array2:- "+Arrays.toString(arr2));
	System.out.println("Array2:- "+Arrays.toString(arr3));
	int[] arr_new= {arr1[0],arr2[1],arr3[2]};
	System.out.println("New Arrays:- "+Arrays.toString(arr_new));

	}

}
