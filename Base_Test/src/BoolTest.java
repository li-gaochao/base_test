import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @date: 2019Äê9ÔÂ9ÈÕ
 */
public class BoolTest {

	public static void main(String arg[]) {
		List<Float> a = new ArrayList<>();
		a.add(null);
		List<Float> b = new ArrayList<>();
		b.add(a.get(0));
		b.add((float) 2.5);
		b.add((a.get(0) == null ? a.get(0) : (float) 2.5));
	}
}
