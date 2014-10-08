public class matrixMult {
	public static void main(String[] args){
		double [][] a = {{1, 2}, {8, 9}, {65, 43}};
		double [][] b = {{88, 14, 73}, {21.1, 2, 22}};
		double [][] c = mmult(a, b);

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}

	public static double[][] mmult(double [][] a, double [][] b) {
		if (a.length == 0 || b.length ==0) {
			return null;
		}

		if (a[0].length != b.length) {
			return null;
		}

		double [][] result = new double[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < b[0].length; k++) {
				int val = 0;
				for (int j = 0; j < a[0].length; j++) {
					val += a[i][j] * b[j][k];
				}
				result[i][k] = val;
			}
		}
		return result;
	}
}