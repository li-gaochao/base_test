import java.math.BigDecimal;

/**
 * @Description:
 * @date: 2019年4月3日
 */
public class Lagrange {
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

		// System.out.println("请输入给定的插值点数量：");
		// Scanner input=new Scanner(System.in);
		// int m=input.nextInt();
		// System.out.println("请输入需求解的插值点数量：");
		// int n=input.nextInt();

		// double x[]=new double[m];
		// double y[]=new double[m];
		// double x0[]=new double[n];
		//
		// for(int i=0;i<m;i++){
		// x[i]=input.nextDouble();
		// }
		// System.out.println("依次输入给定的插值点对应的函数值:");
		// for(int i=0;i<m;i++){
		// y[i]=input.nextDouble();
		// }
		// System.out.println("依次输入需求解的插值点");
		// for(int i=0;i<n;i++){
		// x0[i]=input.nextDouble();
		// }
		// double y0[]=Lag(x, y, x0);
		// System.out.println("运用拉格朗日插值法求解得:");
		// for(int i=0;i<n;i++){
		// System.out.println(y0[i]+" ");
		// }

		double x[] = new double[] { 5, 10, 20, 50, 60, 100 };
		double y[] = new double[] { 0, 20 };
		double value[] = new double[] { 33, 78, 12, 34, 54, 99 };
		double x0[] = new double[300];
		double ynew[] = new double[100];
		for (int i = 0; i < 300; i++) {
			x0[i] = i;
		}

		double y0[] = Lag(x, value, x0);
		// System.out.println("运用拉格朗日插值法求解得:");
		// for(int i=0;i<300;i++){
		// System.out.println(x0[i] + "," +y0[i]);
		// }

		// 得到了100个value，再把y分成100分
		for (int i = 0; i < 100; i++) {
			if (i == 0) {
				ynew[i] = 0;
			} else {
				ynew[i] = ynew[i - 1] + (new BigDecimal("20").divide(new BigDecimal("100"))).doubleValue();
			}

			// System.out.println("ynew[i]" + i +":"+ ynew[i]);
		}
		System.out.println("y0[]:" + y0.length);
		double value0[] = Lag(y, y0, ynew);

		double resultx[] = new double[300];
		double resulty[] = new double[100];
		double resultvalue[] = new double[300];

		System.out.println("运用拉格朗日插值法求解得:");
		// for(int i=0;i<100;i++){
		// resulty[i] = ynew[i];
		// }
		// for(int i=0;i<300;i++){
		// resultx[i] = x0[i];
		// resultvalue[i] = value0[i];
		//
		// System.out.println(x0[i] + "," + ynew[i] + "," +value0[i]);
		// }

		System.out.println("x0[]:" + x0.length);
		System.out.println("ynew[]:" + ynew.length);
		System.out.println("value0[]:" + value0.length);

		for (int i = 0; i < 300; i++) {

			for (int j = 0; j < 100; j++) {

				System.out.println(x0[i] + "," + ynew[j] + "," + value0[i]);
			}

		}

	}
}
