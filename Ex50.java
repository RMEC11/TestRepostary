package exam1;

public class Ex50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print numbers between 1 to 100 which are divisible by 3, 5 and by both
		System.out.println("\nDivide by 3:-");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i + ",");
				i++;
			}
		}
		System.out.println("\nDivide by 5:-");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i + ",");
				i++;
			}
		}
		System.out.println("\nDivide by 5:-");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + ",");
				i++;
			}
		}

	}
}
