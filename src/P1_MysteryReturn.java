/*
	ISYS 320
	Name(s): Jacob and Emma
	Date: Sept. 27
*/

/*
 1. Your output prediction (do yourself a favor and go step by step through the code, recording the value of each variable at each method call):
  
  The program will output  1 2 4
  				 		  7 2 4
  				          7 8 4 
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 We were correct for the first mystery.  We figured out that we forgot to print the y and z of the mystery
 method.  We also misunderstood the order of the variables and how the argument in the mystery parameter changed 
 the values of the main method variables. 
 
 */
public class P1_MysteryReturn {
	public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        z = mystery( x, z, y);
        System.out.println( x + " " + y + " " + z);
        x = mystery( z, z, x);
        System.out.println( x + " " + y + " " + z);
        y = mystery( y, y, z);
        System.out.println( x + " " + y + " " + z);

    }
    
    public static int mystery( int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 2;
        System.out.println(y + " " + z );
        return x;
    }

}
