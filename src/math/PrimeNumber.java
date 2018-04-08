package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int count = 1000000;
		for (int x = 2; x <= count; x++) {
			for (int y = 2; y <= x; y++) {
				if (x == y) {
					System.out.println(x);
				}
				if (x % y == 0) {
					break;
				}
			}
		}

	}

}
