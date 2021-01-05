import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * Copyright: Copyright (c) 2018 akxy
 *
 * @ClassName: Test.java
 * @Description:
 *
 * @version: v1.0.0
 * @author: lgc
 * @date: 2018��12��21��
 */
public class Test {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param: @param args
	 * @return: void
	 */
	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	// Person p = null;
	// List<Person> list = new ArrayList<Person>();
	// for(int i = 0 ; i < 5 ; i++){
	// p = new Person(i);
	// list.add(p);
	// }
	// for(Person person:list){
	// System.out.println(person.toString());
	// }
	// }

	public static void main(String[] args) {
		// Integer i = 100;
		// Integer j = new Integer(100);
		// System.out.print(i == j); //false

		// double x = 3.001;
		// int y = new BigDecimal(x).setScale(0, BigDecimal.ROUND_UP).intValue();
		// System.out.println(y);

		// StringBuilder str = new StringBuilder("00000000000000");
		// System.out.println("length:" + str.length());
		// str.replace(1, 2, "1");
		// System.out.println("length:" + str.length());
		// System.out.println("str:" + str);

		// System.out.println(5%2);

		// String a = null;
		// System.out.println(a!=null&&a.equals("null"));

		// String monthTime = "2018-01-25";
		// System.out.println(monthTime.length());
		// String queryYear = monthTime.substring(0,4);
		// int queryMonth = Integer.valueOf(monthTime.substring(5,7));
		// int queryDay = Integer.valueOf(monthTime.substring(8,10));
		//
		// System.out.println(queryYear);
		// System.out.println(queryMonth);
		// System.out.println(queryDay);

		// timer1();

		// double[] x = new double[]{1,2,3,1,2,3,4};
		// System.out.println(Arrays.toString(x));
		// x = arrayDistanct(x);
		// System.out.println(Arrays.toString(x));

		// Double a = 20.0;
		// System.out.println(a.compareTo(new Double(200.0)));
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// try {
		// String res = getDatePoor(sdf.parse("2019-01-02
		// 12:00:00"),sdf.parse("2019-01-02 12:00:10"));
		// System.out.println(res);
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// BigDecimal a = new BigDecimal("6.75");
		// System.out.println(a.divide(new
		// BigDecimal("1"),BigDecimal.ROUND_UP).setScale(0,BigDecimal.ROUND_UP));

		// �ַ���ȥ���Ǻ���
		// String a = "1234������";
		//
		// String reg = "[^\u4e00-\u9fa5]";
		//
		// System.out.println(a.replaceAll(reg, ""));

		// String dirPath =
		// Thread.currentThread().getContextClassLoader().getResource("").getPath();//��ȡconfig.properties�ļ����ڵĸ�Ŀ¼
		// dirPath = "/E:/AnKeXY/workspace/Base%20Test/bin/";
		// System.out.println("orgPath:" + dirPath);
		// File file = new File(dirPath,"config.properties");
		// //dirPath.replaceAll("%20", " ");
		// try {
		// dirPath = URLDecoder.decode(dirPath, "utf-8");
		// System.out.println("destPaht:" + dirPath);
		// } catch (UnsupportedEncodingException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// int TYPE = 10000000; //���תΪ�ַ������ѵ�һλ���0
		// int quakeNUM = 1;//1
		// int stressNUM = 10;//10
		// int abscissNUM = 100;//100
		// int anchorNUM = 0;//1000
		// int emfNUM = 0;//1000 0
		// int rockNUM = 100000;//1000 00
		// int transformNUM = 1000000;//1000 000
		//
		// TYPE += quakeNUM + stressNUM + abscissNUM + anchorNUM + emfNUM + rockNUM +
		// transformNUM;
		// System.out.println("TYPE:" + TYPE);
		// StringBuilder strTYPE = new StringBuilder(String.valueOf(TYPE));
		// System.out.println("strTYPE:" + strTYPE);
		// strTYPE = strTYPE.replace(0,1,"0");
		// System.out.println("destStrTYPE:" + strTYPE);
		// System.out.println("strTYPE:" + strTYPE.toString());

		// String abscissWARN = "�̻ƺ�";
		//
		// if(abscissWARN.indexOf("��") > 0){
		// abscissWARN = ";��";
		// }else if(abscissWARN.indexOf("��") > 0){
		// abscissWARN = ";��";
		// }else if(abscissWARN.indexOf("��") > 0){
		// abscissWARN = ";��";
		// }
		//
		// System.out.println(abscissWARN);

		// StringBuffer string=new StringBuffer();
		// System.out.println("string:" + string);
		// string.delete(0, string.length());
		// System.out.println("string:" + string);
		// string.append("4000/4001");
		// //string.delete(0, string.length());
		// System.out.println("string:" + string);
		// List<String> mpIds = new ArrayList<String>();
		// mpIds.add("4000/4001");
		// boolean s = mpIds.contains(string.toString());
		// System.out.println("s:" + s);

		//
		// int TYPE = 10000000; //���תΪ�ַ������ѵ�һλ���0
		// int quakeNUM = 1;//1
		// int stressNUM = 10;//10
		// int abscissNUM = 100;//100
		// int anchorNUM = 0;//1000
		// int emfNUM = 0;//1000 0
		// int rockNUM = 200000;//1000 00
		// int transformNUM = 1000000;//1000 000
		//
		//
		//
		// TYPE = 10000000;
		// //TODO ����conn_status���conn_status
		// quakeNUM = quakeNUM>0?1:0;
		// stressNUM = stressNUM>0?10:0;
		// abscissNUM = abscissNUM>0?100:0;
		// anchorNUM = anchorNUM>0?1000:0;
		// emfNUM = emfNUM>0?10000:0 ;
		// rockNUM = rockNUM>0?100000:0 ;
		// transformNUM = transformNUM>0?1000000:0;
		//
		// TYPE = TYPE + quakeNUM + stressNUM + abscissNUM + anchorNUM + emfNUM +
		// rockNUM + transformNUM;
		//
		//
		// // TYPE = TYPE + quakeNUM>0?1:0 + stressNUM>0?10:0 + abscissNUM>0?100:0 +
		// anchorNUM>0?1000:0 + emfNUM>0?10000:0 + rockNUM>0?100000:0 +
		// transformNUM>0?1000000:0;
		//
		// System.out.println("TYPE:" + TYPE);
		// StringBuilder strTYPE = new StringBuilder(String.valueOf(TYPE));
		// System.out.println("strTYPE:" + strTYPE);
		// strTYPE.replace(0,1, "0");
		// System.out.println("REPLACEstrTYPE:" + strTYPE);

		// Long areaId = (long) 0;
		// System.out.println(areaId==0);
		// System.out.println(areaId.equals((long)0));

		// double a = 0.6;
		//
		// double b = 0.5;
		// double c = 0.8;
		// System.out.println(a>=b&&a<c);

		// HashSet<String> s = new HashSet<String>();
		// s.add("2019-01-01");
		// s.add("2019-01-02");
		// s.add("2019-01-03");
		// s.add("2019-01-01");
		// s.add("2019-01-05");
		// Iterator<String> it = s.iterator();
		// while(it.hasNext()){
		// System.out.println(it.next());
		// }

		// Short a = 1;
		// System.out.println(a>=1);

		// Float a = 0.2f;
		// Double.valueOf(a);

		// double degrees = 45.0;
		// double radians = Math.toRadians(degrees);
		//
		// System.out.println(radians);
		// System.out.println(Math.sin(radians));
		//
		//
		// //1Ϊ��ֵ
		// //��Ƕ�
		// DecimalFormat df=new DecimalFormat("#.00");
		// double temp = Math.toDegrees(Math.asin(0.7071067811865475));
		//
		// System.out.println(Double.valueOf(df.format(temp)));
		//
		// double x1 = 1,y1 = 1,z1 = 3;
		// double x2 = 2,y2 = 34,z2 = 3;
		// if(x1==x2 && y1==y2){
		// System.out.println("b");
		// }else if(z1==z2){
		// System.out.println("c");
		// }else if((x1==x2 && y1!=y2) || (y1==y2 && x1!=x2)){
		// System.out.println("a");
		// }
		//
		// System.out.println("-----------");
		// if(x1==x2 && y1==y2){
		// System.out.println("b");
		// }else if(z1==z2){
		// System.out.println("c");
		// }else {
		// System.out.println("a");
		// }

		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// String str = "2019-10-31#####500";
		// String[] strArray = str.split("#");
		// System.out.println("" + strArray[0]);
		// System.out.println("" + strArray[1]);
		// System.out.println("" + strArray[2]);
		// System.out.println("" + strArray[3]);
		// System.out.println("" + strArray[4]);
		// System.out.println("" + strArray[5]);

		// StringBuilder statusStr = new StringBuilder("���̻�");
		// System.out.println(statusStr.indexOf("��"));
		// String status = "��";
		// if(statusStr.indexOf("��") > -1){
		// status = "��";
		// }
		// if(statusStr.indexOf("��") > -1){
		// status = "��";
		// }
		// if(statusStr.indexOf("��") > -1){
		// status = "��";
		// }
		//
		// System.out.println("status:" + status);

		// Date date = new Date();
		// System.out.println(date);

		// BigDecimal a = new BigDecimal("18.24235");
		//
		// System.out.println(a.setScale(2,BigDecimal.ROUND_DOWN));

		// List<Integer> list = new ArrayList<>();
		// list.add(0);
		// list.add(1);
		// list.add(2);
		// list.add(3);
		// list.add(4);
		// list.add(5);
		// list.add(6);
		// list.add(7);
		// list.add(8);
		// list.add(9);
		// list.add(10);
		// list.add(11);
		// list.add(12);

		// int t = 4;
		// int startI = t+1;
		// startI = startI>=list.size()?list.size():startI;

		// for(Integer i:list.subList(0, 5)) {
		// System.out.println(i);
		// }
		// System.out.println("--------");
		// for(Integer i:list.subList(5, list.size() - 5)) {
		// System.out.println(i);
		// }
		// System.out.println("--------");
		// for(Integer i:list.subList(list.size() - 5, list.size())) {
		// System.out.println(i);
		// }

		System.out.println("" + StringUtils.isEmpty(""));

	}

	public static void timer1() {
		// ��һ�ַ������趨ָ������task��ָ��ʱ��timeִ�� schedule(TimerTask task, Date time)

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Calendar calendar = Calendar.getInstance();
				System.out.println(sdf.format(calendar.getTime()));
				if (sdf.format(calendar.getTime()).equals("2019-04-24 16:19:00")) {
					timer.cancel();
				}
			}
		}, 0, 1000);// �趨ָ����ʱ��time,�˴�Ϊ1000����

	}

	public static double[] arrayDistanct(double[] x) {

		// ʵ����һ��set����
		Set<Double> set = new HashSet<>();
		// �������鲢���뼯��,���Ԫ���Ѵ����򲻻��ظ�����
		for (int i = 0; i < x.length; i++) {
			set.add(x[i]);
		}
		// ����Set���ϵ�������ʽ
		Object[] obj = new Object[set.size()];
		obj = set.toArray();
		double[] newx = new double[set.size()];
		for (int i = 0; i < obj.length; i++) {
			newx[i] = (double) obj[i];
		}
		return newx;
	}

	public static String getDatePoor(Date nowDate, Date endDate) {

		long nd = 1000 * 24 * 60 * 60;
		long nh = 1000 * 60 * 60;
		long nm = 1000 * 60;
		long ns = 1000;
		// �������ʱ��ĺ���ʱ�����
		long diff = endDate.getTime() - nowDate.getTime();
		// ����������
		long day = diff / nd;
		// ��������Сʱ
		long hour = diff % nd / nh;
		// �������ٷ���
		long min = diff % nd % nh / nm;
		// ����������
		long sec = diff % nd % nh % nm / ns;
		if (day <= 0) {
			if (hour <= 0) {
				return min + "����" + sec + "��";
			} else {
				return hour + "Сʱ" + min + "����" + sec + "��";
			}
		} else {
			return day + "��" + hour + "Сʱ" + min + "����" + sec + "��";
		}
	}

}

class Person {
	private int age;

	public Person() {
	};

	public Person(int age) {
		this.age = age;
	};

	@Override
	public String toString() {
		return String.valueOf(age);
	};
}