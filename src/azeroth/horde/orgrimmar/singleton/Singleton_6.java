package azeroth.horde.orgrimmar.singleton;
/**
 * Effective Java推荐的实现方式
 * 只有当调用newSingleton方法时，才加载内部类SingletonInstance，此时实例化Singleton_6。
 * 由于INSTANCE是static，因此只在加载时实例化一次
 * 由于SingletonInstance是私有静态内部类，所以不会被其他类知道，同样，static语义也要求不会有多个实例存在。
 * 并且，JSL规范定义，类的构造必须是原子性的，非并发的，因此不需要加同步块。
 * 同样，由于这个构造是并发的，所以newSingleton()也并不需要加同步。
 * @author Administrator
 *
 */
public class Singleton_6 {
	private static class SingletonInstance{
		private static final Singleton_6 INSTANCE = new Singleton_6();
	}
	
	public static Singleton_6 newSingleton(){
		return SingletonInstance.INSTANCE;
	}
	private Singleton_6(){
		
	}

}
