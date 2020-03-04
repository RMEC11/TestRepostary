
public class ArrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] student; student = new int[100]; String month[] =
		 * {"Jan","Feb","Mar","Apr"}; System.out.println(month[0]);
		 * System.out.println(month.length); for(int i=0; i<month.length; i++) {
		 * System.out.println(month[i]); }
		 */

		int raw = 3;
		int cal = 3;
		int table[][] = new int[raw][cal];

		table[0][0] = 10;
		table[0][1] = 20;
		table[0][2] = 30;

		table[1][0] = 40;
		table[1][1] = 50;
		table[1][2] = 60;

		table[2][0] = 70;
		table[2][1] = 80;
		table[2][2] = 90;

		System.out.println(table.length);
		System.out.println(table[0][1]);
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < cal; j++) {
				System.out.print(" "+table[i][j]);

			}System.out.println("");
		}

	}

}
