package azeroth.horde.orgrimmar.singleton;
/**
 * ͬ������ģʽ
 * synchronized�������εķ���������������
 * @author Administrator
 *
 */
public class Singleton_3 {
	
	private static Singleton_3 INSTANCE = null;
	
	public synchronized static Singleton_3 newSingleton(){
		if(INSTANCE==null){
			INSTANCE = new Singleton_3();
		}
		return INSTANCE;
	}

}
