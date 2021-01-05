public class ListSet {

	public static void main(String[] args) {
		SetList<String> s = new SetList<String>();
		s.add("aaa");
		s.add("xxx");
		s.add("aaa");
		for (String a : s) {
			System.out.println(a);
		}
	}
}