

public class Primer {
	/**
	 * Count odd or postive elements
	 *
	 * @param x
	 *            array to search
	 * @return count of odd/positive values in x
	 * @throws NullPointerException
	 *             if x is null
	 */
	public int oddOrPos(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 1 && x[i] > 0) {
				count++;
			}
		}
		return count;
	}
	// test: x = [-3, -2, 0, 1, 4]; Expected = 3

}

