

public class Primer {
	
	public int oddOrPos(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length + 1; i++) {
			if (x[i] % 2 == 1 && x[i] > 0) {
				count++;
			}
		}
		return count;
	}
	// test: x = [-3, -2, 0, 1, 4]; Expected = 3

}

