package azeroth.horde.orgrimmar;
import java.util.HashMap;

import azeroth.Utils;

public class TestEntry {

	public TestEntry() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Lok'tar ogar");
		HashMap<String,String> map = Utils.newInstance();
		map.put("1", "1");
		System.out.println(map.get("1").toString());
		TestClass1 tc1 = new TestClass1();
		TestClass3 tc3 = new TestClass3.Builder(1, 2).property3(3).property4(4).property5(5).builder();
		System.out.println(tc3);
	}

}
