
public class PrintTable {
	public static void table(int t) {

		for (int i = 1; i <= 10; i++) {
			if(i==5)
				continue;
			System.out.println(i * t);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		table(15);
	}

}
