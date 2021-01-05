package com.lgc.test;

/**
 *
 * Copyright: Copyright (c) 2018 akxy
 *
 * @ClassName: Single.java
 * @Description: 单例模式
 *
 * @version: v1.0.0
 * @author: lgc
 * @date: 2019年1月10日
 */
public class Single {
	public static void main(String[] args) {
		TestSingle single = TestSingle.getInstance();
		System.out.println(single);
	}
}

class TestSingle {
	private static TestSingle single = new TestSingle();

	private TestSingle() {

	};

	public static TestSingle getInstance() {
		return single;
	}
}