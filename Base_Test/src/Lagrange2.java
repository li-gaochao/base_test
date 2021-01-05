import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @date: 2019Äê4ÔÂ3ÈÕ
 */
public class Lagrange2 {
	private static double[] Lag(double x[], double y[], double x0[]) {
		int m = x.length;
		int n = x0.length;
		double y0[] = new double[n];
		for (int ia = 0; ia < n; ia++) {
			double j = 0;
			for (int ib = 0; ib < m; ib++) {
				double k = 1;
				for (int ic = 0; ic < m; ic++) {
					if (ib != ic) {
						k = k * (x0[ia] - x[ic]) / (x[ib] - x[ic]);
					}
				}
				k = k * y[ib];
				j = j + k;
			}
			if (j < 0) {
				y0[ia] = 0;
			} else {
				y0[ia] = j;
			}
		}
		return y0;
	}

	public static void main(String[] args) {

		double x[] = new double[] { 20, 50, 80, 110, 140, 170, 200 };
		double y[] = new double[] { 10, 15 };

		double value1[] = new double[] { 33, 78, 12, 34, 54, 66, 99 };
		double value2[] = new double[] { 21, 56, 18, 42, 60, 80, 79 };

		double x0[] = new double[300];
		for (int i = 0; i < 300; i++) {
			x0[i] = i;
		}
		double y0[] = new double[100];
		for (int i = 0; i < 100; i++) {
			y0[i] = i;
		}

		double xv1[] = Lag(x, value1, x0);
		double xv2[] = Lag(x, value2, x0);

		List<double[]> res = new ArrayList<double[]>();
		for (int i = 0; i < 300; i++) {
			double y01 = 0;
			double y02 = xv1[i];
			double y03 = xv2[i];
			double y04 = 0;
			double yvalue[] = { y01, y02, y03, y04 };
			double newvalue[] = Lag(y, yvalue, y0);
			for (int j = 0; j < newvalue.length; j++) {
				double point[] = new double[] { x0[i], y0[j], newvalue[j] };
				res.add(point);
			}
		}
		System.out.println(res.size());

		for (double d[] : res) {
			System.out.println(d[0] + "," + d[1] + "," + d[2]);
		}
		// double y0[]=Lag(x, value, x0);

	}
}
