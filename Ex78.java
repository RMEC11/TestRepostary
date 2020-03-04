package exam1;

import java.util.Arrays;

public class Ex78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {4,7};
		System.out.println("Origional Array:- "+Arrays.toString(arr1));
		if(arr1[0]==4 || arr1[0]==7)
		{
			System.out.println("True");
		}else if(arr1[1]==4||arr1[1]==7){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
			
	}

}
