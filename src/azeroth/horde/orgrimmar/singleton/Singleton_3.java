package azeroth.horde.orgrimmar.singleton;
/**
 * 同步单例模式
 * synchronized方法修饰的方法存在性能问题
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
