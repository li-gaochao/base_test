import com.google.common.collect.ComparisonChain;

/**
 * @Description:
 * @date: 2020Äê8ÔÂ17ÈÕ
 */
public class SimplePojo {
	public static final String GROCERY = "GROCERY";
	private String type;
	private Double value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * @param type
	 * @param value
	 */
	public SimplePojo(String type, Double value) {
		super();
		this.type = type;
		this.value = value;
	}

	public int compareTo(SimplePojo other) {
		return ComparisonChain.start().compare(this.type, other.type).compare(this.value, other.value).result();
	}

}
