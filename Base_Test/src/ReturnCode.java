
/**
 * @Description:
 * @date: 2019��4��11��
 */
public enum ReturnCode {

	SUCCESS("0000", "��ѯ�ɹ�"), NODATA("0001", "��ѯ�ɹ��޼�¼"), FEAILED("0002", "��ѯʧ��"),
	ACCOUNT_ERROR("1000", "�˻������ڻ򱻽���"), API_NOT_EXISTS("1001", "����Ľӿڲ�����"),
	API_NOT_PER("1002", "û�иýӿڵķ���Ȩ��"), PARAMS_ERROR("1004", "����Ϊ�ջ��ʽ����"), SIGN_ERROR("1005", "����ǩ������"),
	AMOUNT_NOT_QUERY("1010", "�������޷����в�ѯ"), API_DISABLE("1011", "��ѯȨ���ѱ�����"), UNKNOWN_IP("1099", "�Ƿ�IP����"),
	SYSTEM_ERROR("9999", "ϵͳ�쳣");

	private String code;
	private String msg;

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	ReturnCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public static void main(String args[]) {
		System.out.println(ReturnCode.SUCCESS.getCode());
	}

}
