package azeroth.horde.orgrimmar.singleton;
/**
 * this is a lazy loaded singleton implementation
 * �ӳټ��ص���ģʽ�������������
 * @author Administrator
 *
 */
public class Singleton_2 {
	
	private static Singleton_1 INSTANCE = null;
	
	public static Singleton_1 Singleton_lazyLoaded(){
		if(INSTANCE==null){
			INSTANCE = new Singleton_1();
		}
		return INSTANCE;
	}
}
