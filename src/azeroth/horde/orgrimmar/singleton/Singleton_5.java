package azeroth.horde.orgrimmar.singleton;
/**
 * ��volatile���ε�д�������ܺ�֮ǰ�Ķ�д������������������ܺ�֮��Ķ�д�������
 * ������jdk1.5����
 * @author Administrator
 *
 */
public class Singleton_5 {
	
	private volatile static Singleton_5 INSTANCE = null;
	
	public static Singleton_5 newSingleton(){
		if(INSTANCE==null){
			synchronized(Singleton_5.class){
				if(INSTANCE==null){
					INSTANCE = new Singleton_5();
				}
			}
		}
		return INSTANCE;
	}
}
