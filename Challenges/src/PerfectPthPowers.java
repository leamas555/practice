/**
 * 
 * @author seanders
 * Your goal is to find the highest value of P for a given X such that for some unknown integer 
 * Y, YP should equal X. You can expect the given input integer X to be within the range of an 
 * unsigned 32-bit integer (0 to 4,294,967,295).
 */
public class PerfectPthPowers {

	public static double getGreatestPower(double x) {
		
		double e, e2 = 0;
		double i = 1;
		int p = 1;
		// stop once you get to a point where you are return the whole number 1.
		do {
			e = Math.pow(x,  1.0/i);
			e2 = Math.floor(e);
			
			System.out.println(i + ". " + e);
			
			if (e - e2 > 0 == false) {
				p = (int)i;
			}
			i++;
		} while (e2 > 1);
		
		return p;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		
		double x = 40353607;
		System.out.println("The greatest power is: " + (int)getGreatestPower(x));
		
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime) );
	}

}
