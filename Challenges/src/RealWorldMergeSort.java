/**
 *  @author Sejr Andersen
 *  
 * You will be given two lists, list A and B, where the elements are positive integers from 1 to 2147483647; 
 * the integer '0' is reserved as "buffer space". List A will not be pre-sorted, though list B will be 
 * pre-sorted and will start with a series of '0' values. These '0' values are simply reserved space in list 
 * B which is the same number of elements that list A has. You cannot modify list A in any way, though list 
 * B is fair game. Your goal is to return a merged and sorted list of elements of list A into list B, where 
 * you cannot allocate any extra space other than simple / trivial local variables for your function.
 *
 */

public class RealWorldMergeSort {
	
	public static int[] mergeAndSort(int[] a, int[] b) {
		
		// merge list
		for (int x = 0; x < b.length; x++) {
			if (b[x] == 0) {
				b[x] = a[x];
			}
		}
		
		// sort list
		int t = -1;
		for (int x = 0; x < b.length; x++) {
			for (int y = x; y < b.length - 1; y++) {
				if (b[y] > b[y + 1]) {
					t = b[y];
					b[y] = b[y+1];
					b[y+1] = t;
				}
			}			
		}
		return b;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		
		int[] a = {692,1,32};
		int[] b = {0,0,0,14,15,123,2431};
		
		mergeAndSort(a, b);
		
		String s = "";
		for (int x = 0; x < b.length; x++) {
			s += b[x] + " ";
		}
		System.out.println(s);
		
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
	}

}
