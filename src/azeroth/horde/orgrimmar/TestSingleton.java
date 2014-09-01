package azeroth.horde.orgrimmar;

public class TestSingleton {

	private static TestSingleton INSTANCE = null;
	
	public synchronized  static TestSingleton newTestSingleten(){
		if(INSTANCE ==null){
			INSTANCE = new TestSingleton();
		}
		return INSTANCE;
	}
}
