public class McCarthy91 {
		
		static int r = 0;

		public static int m(int n) {
			
			if (n <= 100) {
				r = r + 1;
				System.out.println ("M(M(" + (n + 11) + ")) since " + n + " is equal to or less than 100");
				return m(m(n + 11));
			}
			else {
				r = r - 1;
				if (r == -1)
					System.out.println (n - 10 +" since " + n +" is greater than 100");
				else
					System.out.println ("M("+ (n - 10) +") since " + n +" is greater than 100");
				return n - 10;
			}
		}
		
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			final long startTime = System.currentTimeMillis();
			
			int n = 0;
			System.out.println ("M("+n+")");
			System.out.println (m(n));
			final long endTime = System.currentTimeMillis();

			System.out.println("Total execution time: " + (endTime - startTime) );

		}


}
