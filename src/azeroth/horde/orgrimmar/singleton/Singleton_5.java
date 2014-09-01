package azeroth.horde.orgrimmar.singleton;
/**
 * 被volatile修饰的写变量不能和之前的读写代码调整，读变量不能和之后的读写代码调整
 * 仅用于jdk1.5以上
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
