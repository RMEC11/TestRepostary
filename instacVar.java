
class Emp{
	public static double salary;
	public static String name ="Abhishek";
}
class Marks{
	int engMarks;
	int mathMarks;
	int phyMarks;
	
}
public class instacVar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Marks obj1 = new Marks();
	obj1.engMarks =50;
	obj1.mathMarks =80;
	obj1.phyMarks =90;
	
	Marks obj2 = new Marks();
	obj2.engMarks =60;
	obj2.mathMarks =85;
	obj2.phyMarks =95;
	
	System.out.println("*********Marks for first object:*******");
	System.out.println("English:- "+obj1.engMarks);
	System.out.println("Maths:- "+obj1.mathMarks);
	System.out.println("Physics:- "+obj1.phyMarks);
	
	System.out.println("*****Marks for second object:*******");
	System.out.println("English:- "+obj2.engMarks);
	System.out.println("Maths:- "+obj2.mathMarks);
	System.out.println("Physics:- "+obj2.phyMarks);
	
Emp.salary =1890.25;
System.out.println(Emp.name +"'s average salary:- "+Emp.salary+"$");
int x = 2;
for(long y = 0, z = 4; x < 10 && y < 10; x++, y++) 
{
  //  System.out.println(y + " ");
}

System.out.println(x);

	
	}

}
