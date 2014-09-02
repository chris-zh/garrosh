package azeroth.horde.orgrimmar.singleton;
/**
 * 私有构造器的单例模式
 * effective java推荐
 * @author chris.zhang
 *
 */
public class Singleton_8 {
	private Singleton_8(){}
	public  static final Singleton_8 instance = new Singleton_8();

}
