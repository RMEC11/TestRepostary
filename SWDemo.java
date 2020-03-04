
public class SWDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Branch = "CCE";
		int year =4;
		
		switch (year) {
		case 1:System.out.println("Elective Courses: Advance English");
			break;
		case 2:
			switch (Branch) {
			case "CSE":
			case "CCE":
				 System.out.println("Elective courses : Machine Learning, Big Data");
	                break;
	 
	            case "ECE":
	                System.out.println("Elective courses : Antenna Engineering");
	                break;
	 
				
				default:
				break;
			}
			default:
			System.out.println("Elective courses : Optimization");
			break;
		}
/*int day =7;
String dayString;
String dayType;

 // switch statement with int data type
switch (day) {
case 1:
	dayString = "Monday";
	break;
case 2:
	dayString = "Tuesday";
	break;
case 3:
	dayString = "Wednesday";
	break;
case 4:
	dayString = "Thursday";
	break;
case 5:
	dayString = "Friday";
	break;
case 6:
	dayString = "Saturday";
	break;
case 7:
	dayString = "Sunday";
	break;
default:
	dayString = "Invalid day";
	}
switch (day) {
case 1:
case 2:
case 3:
case 4:
case 5:
	dayType = "Weekday";
	break;
case 6:
case 7:
	dayType = "Weekend";
	break;
default:
	dayType = "Invalid dayType";
}
System.out.println(dayString + " is a " + dayType);
	}*/

	}

}
