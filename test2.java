package basic4;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int avg= 0; 
		for (int i : my_array)
			sum += i;
		System.out.println("The sum is " + sum);
		avg=sum/my_array.length;
		System.out.println(avg);

	}

}
