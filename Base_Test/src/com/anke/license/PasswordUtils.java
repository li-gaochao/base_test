package com.anke.license;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @Description:
 * @date: 2019��6��6��
 */
public class PasswordUtils {
	private static String algorithmName = "md5"; // ָ��ɢ���㷨ΪMD5,���б���㷨�磺SHA256��SHA1��SHA512
	private static int hashIterations = 1; // ɢ�е������� md5(md5(pwd)): new Md5Hash(pwd, salt, 2).toString()

	public void setAlgorithmName(String algorithmName) {
		PasswordUtils.algorithmName = algorithmName;
	}

	public void setHashIterations(int hashIterations) {
		PasswordUtils.hashIterations = hashIterations;
	}

	// ���ܣ��������ĵõ�����
	// salt:�� �����õ����û���
	public static String encodePassword(String pwd, String salt) {
		// user.setSalt(randomNumberGenerator.nextBytes().toHex());
		String newPassword = new SimpleHash(algorithmName, pwd, ByteSource.Util.bytes(salt), hashIterations).toHex();

		return newPassword;
	}

	public boolean verifyPassword(String targetPassword, String pwd, String salt) {
		String newPassword = PasswordUtils.encodePassword(targetPassword, salt);
		if (newPassword.equals(pwd)) {
			return true;
		} else {
			return false;
		}
	}

	// �� 835578
	public static void main(String[] args) {
		String despwd = encodePassword("BFEBFBFF000306C3", "835578");
		System.out.println(despwd);
	}
}
