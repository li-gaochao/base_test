
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @date: 2019å¹?8æœ?22æ—?
 */
public class LinearSmooth {
	/**
	 * @Title: handle3Times
	 * @Description: 3ç‚¹çº¿æ€§å¹³æ»?
	 * @param: @param  !orgList
	 * @param: @return
	 * @return: List<Float>
	 */
	public static List<Float> handle3Times(List<Float> orgList) {
		int size = orgList.size();
		List<Float> destList = new ArrayList<>();
		if (size < 3) {
			for (int i = 0; i <= size - 1; i++) {
				destList.add(orgList.get(i));
			}
			return destList;
		} else {
			if (!orgList.get(0).isNaN() && !orgList.get(1).isNaN() && !orgList.get(2).isNaN()) {
				float temp1 = new BigDecimal((5.0 * orgList.get(0) + 2.0 * orgList.get(1) - orgList.get(2)) / 6.0)
						.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
				destList.add(temp1 < 0 ? 0 : temp1);
			} else {
				destList.add(orgList.get(0));
			}
			for (int i = 1; i <= size - 2; i++) {
				if (!orgList.get(i - 1).isNaN() && !orgList.get(i).isNaN() && !orgList.get(i + 1).isNaN()) {
					float temp2 = new BigDecimal((orgList.get(i - 1) + orgList.get(i) + orgList.get(i + 1)) / 3.0)
							.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
					destList.add(temp2 < 0 ? 0 : temp2);
				} else {
					destList.add(orgList.get(i));
				}
			}
			if (!orgList.get(size - 1).isNaN() && !orgList.get(size - 2).isNaN() && !orgList.get(size - 3).isNaN()) {
				float temp3 = new BigDecimal(
						(5.0 * orgList.get(size - 1) + 2.0 * orgList.get(size - 2) - orgList.get(size - 3)) / 6.0)
								.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
				destList.add(temp3 < 0 ? 0 : temp3);
			} else {
				destList.add(orgList.get(size - 1));
			}
			return destList;
		}
	}

	/**
	 * @Title: handle5Times
	 * @Description: 5ç‚?2æ¬¡çº¿æ€§å¹³æ»?
	 * @param: @param  !orgList
	 * @param: @return
	 * @return: List<Float>
	 */
	public static List<Float> handle52Times(List<Float> orgList) {
		int size = orgList.size();
		List<Float> destList = new ArrayList<>();
		if (size < 5) {
			for (int i = 0; i <= size - 1; i++) {
				destList.add(orgList.get(i));
			}
			return destList;
		} else {
			if (!orgList.get(0).isNaN() && !orgList.get(1).isNaN() && !orgList.get(2).isNaN() && !orgList.get(3).isNaN()
					&& !orgList.get(4).isNaN()) {
				float temp1 = new BigDecimal(((69.0 * orgList.get(0) + 4.0 * orgList.get(1) - 6.0 * orgList.get(2)
						+ 4.0 * orgList.get(3) - orgList.get(4)) / 70.0)).setScale(2, BigDecimal.ROUND_HALF_UP)
								.floatValue();
				destList.add(temp1 < 0 ? 0 : temp1);
				float temp2 = new BigDecimal(((2.0 * orgList.get(0) + 27.0 * orgList.get(1) + 12.0 * orgList.get(2)
						- 8.0 * orgList.get(3) + 2.0 * orgList.get(4)) / 35.0)).setScale(2, BigDecimal.ROUND_HALF_UP)
								.floatValue();
				destList.add(temp2 < 0 ? 0 : temp2);
			} else {
				float temp3 = orgList.get(0).isNaN() ? Float.NaN
						: new BigDecimal(orgList.get(0)).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
				destList.add(temp3 < 0 ? 0 : temp3);
				float temp4 = orgList.get(1).isNaN() ? Float.NaN
						: new BigDecimal(orgList.get(1)).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
				destList.add(temp4 < 0 ? 0 : temp4);
			}
			for (int i = 2; i <= size - 3; i++) {
				if (!orgList.get(i - 2).isNaN() && !orgList.get(i + 2).isNaN() && !orgList.get(i - 1).isNaN()
						&& !orgList.get(i + 1).isNaN() && !orgList.get(i).isNaN()) {

					float temp5 = new BigDecimal(((-3.0 * (orgList.get(i - 2) + orgList.get(i + 2))
							+ 12.0 * (orgList.get(i - 1) + orgList.get(i + 1)) + 17.0 * orgList.get(i)) / 35.0))
									.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
					destList.add(temp5 < 0 ? 0 : temp5);
				} else {
					float temp6 = orgList.get(i).isNaN() ? Float.NaN
							: new BigDecimal(orgList.get(i)).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
					destList.add(temp6 < 0 ? 0 : temp6);
				}
			}
			if (!orgList.get(size - 5).isNaN() && !orgList.get(size - 4).isNaN() && !orgList.get(size - 3).isNaN()
					&& !orgList.get(size - 2).isNaN() && !orgList.get(size - 1).isNaN()) {
				float temp7 = new BigDecimal(
						((2.0 * orgList.get(size - 5) - 8.0 * orgList.get(size - 4) + 12.0 * orgList.get(size - 3)
								+ 27.0 * orgList.get(size - 2) + 2.0 * orgList.get(size - 1)) / 35.0))
										.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
				destList.add(temp7 < 0 ? 0 : temp7);
				float temp8 = new BigDecimal(
						((-orgList.get(size - 5) + 4.0 * orgList.get(size - 4) - 6.0 * orgList.get(size - 3)
								+ 4.0 * orgList.get(size - 2) + 69.0 * orgList.get(size - 1)) / 70.0))
										.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
				destList.add(temp8 < 0 ? 0 : temp8);
			} else {
				float temp9 = orgList.get(size - 2).isNaN() ? Float.NaN
						: new BigDecimal(orgList.get(size - 2)).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
				destList.add(temp9 < 0 ? 0 : temp9);
				float temp10 = orgList.get(size - 1).isNaN() ? Float.NaN
						: new BigDecimal(orgList.get(size - 1)).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
				destList.add(temp10 < 0 ? 0 : temp10);
			}

			return destList;
		}
	}

	public static void main(String[] args) {
		List<Float> orgList = new ArrayList<>();
		List<Float> des3List = new ArrayList<>();
		List<Float> des5List = new ArrayList<>();
		orgList.add(5.78f);
		orgList.add(5.75f);
		orgList.add(5.76f);
		orgList.add(5.69f);
		orgList.add(5.73f);
		orgList.add(5.78f);
		orgList.add(5.67f);
		orgList.add(5.71f);
		orgList.add(5.75f);
		orgList.add(5.77f);

		orgList.add(7.78f);
		orgList.add(7.75f);
		orgList.add(7.75f);
		orgList.add(7.66f);
		orgList.add(7.71f);
		orgList.add(7.68f);
		orgList.add(7.66f);
		orgList.add(7.78f);
		orgList.add(7.72f);
		orgList.add(7.74f);

		des3List = handle3Times(orgList);
		des5List = handle52Times(orgList);

		String orgStr = "", des3Str = "", des5Str = "";
		for (int i = 0; i < orgList.size(); i++) {
			orgStr += orgList.get(i) + ",";
			des3Str += des3List.get(i) + ",";
			des5Str += des5List.get(i) + ",";
		}
		System.out.println("orgList.size:" + orgList.size());
		System.out.println("orgStr:" + orgStr);
		System.out.println("org3List.size:" + des3List.size());
		System.out.println("des3Str:" + des3Str);
		System.out.println("des5List.size:" + des5List.size());
		System.out.println("des5Str:" + des5Str);
	}

}
