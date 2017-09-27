/*
	ISYS 320
	Name(s): Jacob and Emma
	Date: Sept. 27
*/

/*
 What were the errors you found?
 The ftoc method was void and it did not have a return statement.  The main method did not have a way to call ftoc 
 to fulfill the statement. 
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		double celsius = ftoc(tempf, tempc);
		System.out.println("Body temp in C is: " + celsius);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf, double tempc) {
	      tempc = (tempf - 32) * 5 / 9;
	      return tempc;
    }
}
