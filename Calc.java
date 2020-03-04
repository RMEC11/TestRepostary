
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc a = new Calc();

		System.out.println(a.Add(10, 20));
		System.out.println(a.Min(20, 10));
		System.out.println(a.Sub(10, 20));
		System.out.println(a.Div(20, 10));

		double num = Math.random() * 100;
		System.out.println(num);
	}

	public int Add(int x, int y) {
		int z = x + y;
		return z;

	}

	public int Div(int x, int y) {

		int z = x / y;
		return z;

	}

	public int Min(int x, int y) {

		int z = x - y;
		return z;

	}

	public int Sub(int x, int y) {

		int z = x * y;
		return z;

	}

}
