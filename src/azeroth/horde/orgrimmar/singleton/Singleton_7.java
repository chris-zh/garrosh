package azeroth.horde.orgrimmar.singleton;
/**
 * 
 * 使用enum关键字来实现单例模式的好处是这样非常简洁，
 * 并且无偿地提供了序列化机制，绝对防止多次实例化，
 * 即使是在面对复杂的序列化或者反射攻击的时候。——来自《Effective Java》
 * @author chris.zhang
 *
 */
public enum Singleton_7 {
	INSTANCE;
	int aa;
	
	public static void main(String[] args) {
		Singleton_7 st = Singleton_7.INSTANCE;
		Singleton_7 st2 = Singleton_7.INSTANCE;
		System.out.println(st.aa);
		System.out.println(st2.aa);
		st.aa = 2;
		System.out.println(st.aa);
		System.out.println(st2.aa);
	}
}
