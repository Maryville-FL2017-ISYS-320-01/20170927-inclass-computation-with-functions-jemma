/*
	ISYS 320
	Name(s): Jacob and Emma
	Date: Sept. 27
*/

public class P6_Scientific {

	public static void main(String[] args) {
		// REMINDER: Any print statements should only be in the main method
	
			double base = 6.5;
			int exp= 3;
			double scientificoutput = computeScientificValue (base, exp);
			System.out.println(scientificoutput);
		}

		public static double computeScientificValue(double x, double y) {
		      z = x * Math.pow(10,y);
		  
		      return z;
	}
}

