import java.text.ParseException;
import java.util.List;

import com.google.common.collect.Lists;

public class Java8Tester {
	public static void main(String args[]) throws ParseException {
		Java8Tester tester = new Java8Tester();
		// // 类型声明
		// MathOperation addition = (int a, int b) -> a + b;
		// // 不用类型声明
		// MathOperation subtraction = (a, b) -> a - b;
		// // 大括号中的返回语句
		// MathOperation multiplication = (int a, int b) -> {
		// return a * b;
		// };
		// // 没有大括号及返回语句
		// MathOperation division = (int a, int b) -> a / b;
		// System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		// System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		// System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		// System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		// // 不用括号
		// GreetingService greetService1 = message ->
		// System.out.println("Hello " + message);
		// // 用括号
		// GreetingService greetService2 = (message) ->
		// System.out.println("Hello " + message);
		// greetService1.sayMessage("Runoob");
		// greetService2.sayMessage("Google");

		// LocalDateTime now = LocalDateTime.now();
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd
		// HH:mm:ss");
		// // String etime = now.format(formatter);
		// String etime = formatter.format(now);
		// System.out.println(etime);
		//
		//
		// LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now()
		// ,ZoneId.systemDefault());
		//
		// String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy:MM:dd
		// HH:mm:ss"));
		// System.out.println(format);

		// 流操作
		// type 为 GROCERY 的所有交易，然后返回以交易值降序排序好的交易 ID 集合
		// List<Transaction> transactions = new ArrayList<>();
		// List<Integer> transactionsIds = transactions.parallelStream().
		// filter(t -> t.getType() == Transaction.GROCERY).
		// sorted(Comparator.comparing(Transaction::getValue).reversed()).
		// map(Transaction::getId).
		// collect(Collectors.toList());

		// List<String> l = new ArrayList<String>();
		// l.add("a");
		// l.add("b");
		// l.add("c");
		// System.out.println("l:" + l.toString());
		// l.removeIf(s->s=="a"||s=="c");
		//
		// System.out.println("l:" + l.toString());

		// Double d = 0.048;
		// System.out.println(new Double((d*100)).longValue());
		//
		// Long l = d.longValue() *100;
		// System.out.println(l);

		// SimpleDateFormat sdf = new SimpleDateFormat("M月d日");
		// System.out.println(sdf.format(new Date()));

		// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss",
		// Locale.CHINA);
		// LocalDateTime ldt = LocalDateTime.now();
		// System.out.println(ldt.format(dtf));

		// JSON类的用法
		// 整体是一个JSONArray
		/*
		 * JSONArray jsonArray = new JSONArray(); // 读取表头行，生成一个表头list //
		 * 每行都是一个JSONObject JSONObject jsonObject = new JSONObject(); JSONObject
		 * jsonObject2 = new JSONObject();
		 *
		 * try { jsonObject.put("standard", "应力临界指标"); jsonObject.put("tunnel_name",
		 * "轨顺");
		 *
		 * jsonObject2.put("standard", "应力临界指标2"); jsonObject2.put("tunnel_name",
		 * "轨顺2"); } catch (JSONException e) { // TODO 自动生成的 catch 块
		 * e.printStackTrace(); }
		 *
		 * jsonArray.put(jsonObject); jsonArray.put(jsonObject2);
		 *
		 * System.out.println(jsonArray);
		 */

		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// Date queryDate = sdf.parse("2020-08-02 15:25:48");
		// Date nowDate = new Date();
		// Calendar calendar = Calendar.getInstance();
		// calendar.setTime(nowDate);
		// calendar.add(Calendar.DAY_OF_MONTH, -9);
		// Date oldDate = calendar.getTime();
		// System.out.println("--" + sdf.format(oldDate));
		// String tableName = "stress_datainfo";
		// //
		// 判断表名：如果查询的todayStartTime是在十天前，用stress_datainfo;十天以内，用stress_datainfo_recent
		// if (oldDate.compareTo(queryDate) < 0) {
		// tableName = "stress_datainfo_recent";
		// }
		// System.out.println("tableName:" + tableName);

		// String s = "1";
		// System.out.println(s.split(",")[0]);
		//		BigDecimal a = new BigDecimal("9.96");
		//		System.out.println(a.setScale(0, BigDecimal.ROUND_DOWN));

		//		String tempStartTime = "2020-10-01 00:00:00";
		//		System.out.println(tempStartTime.substring(0, 10));

		List<Double> list = Lists.newArrayList();
		for(int i = 0 ; i < 100 ; i ++) {
			list.add(Math.random() + 5);
		}
		for(int i = 0 ; i < 30 ; i ++) {
			list.add(null);
		}
		for(int i = 0 ; i < 100 ; i ++) {
			list.add(Math.random() + 5);
		}
		for(int i = 0 ; i < 10 ; i ++) {
			list.add(null);
		}
		for(int i = 0 ; i < 100 ; i ++) {
			list.add(Math.random() + 5);
		}
		//对这
		for(Double d:list) {
			System.out.println(d);
		}
		//连续为null小于30个的，进行特殊赋值 Double.NaN;




	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}