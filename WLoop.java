
public class WLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array[]= {"Ron", "Harry","Hermoine"};
		int x=8;
		while(x==8)
		{
			System.out.println("Value of X:-" +x);
			x++;
		}
		 for(String i:array)
		 {
			 System.out.println(i);
		 }
		 do {
			 System.out.println("Value of X:-" +x);
			 x++;
		 }while(x<15);
		 
	}

}
