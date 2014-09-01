package azeroth.horde.orgrimmar.singleton;
/**
 * the most simple implementation singleton
 * 存在性能问题
 * @author Administrator
 *
 */
public class Singleton_1 {
	
	private static Singleton_1 INSTANCE = new Singleton_1();
	
	public static Singleton_1 newSingleton(){
		return INSTANCE;
	}

}
