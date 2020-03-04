package exam1;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create and display unique four-digit number using 1, 2, 3, 4,5. Also count how many three-digit numbers are there
		int amt = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				for (int k = 1; k <= 5; k++) {
					for (int l = 1; l <= 5; l++) {
						if (l != i && l != j && l != k && i != j && j != k) {
							amt++;
							System.out.println(i + "" + j + "" + k+""+l);
						}
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amt);
	}

}
