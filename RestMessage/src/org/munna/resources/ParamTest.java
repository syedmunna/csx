package org.munna.resources;

import java.util.Date;

public class ParamTest {
	private static String header;
	
	public String getHeader() {
		return header;
	}

	

	/*public ParamTest(String header) {
		this.header=header;
	}*/
	public static void valueOf(String header) {
		ParamTest.header=header;
	}
}
