/*
	ISYS 320
	Name(s): Jacob and Emma
	Date: Sept. 27
*/

public class P6_Scientific {

	public static void main(String[] args) {
	
			double base = 7.2;
			int exp= 4;
			double scientificoutput = computeScientificValue (base, exp);
			System.out.println(scientificoutput);
		}

		public static double computeScientificValue(double x, double y) {
			double z = x * Math.pow(10,y);
		  
		      return z;
	}
}

