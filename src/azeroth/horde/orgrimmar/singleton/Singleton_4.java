package azeroth.horde.orgrimmar.singleton;
/**
 * 解决同步性能问题的单例模式
 * 但是仍然存在问题
 * @author Administrator
 *
 */
public class Singleton_4 {
	
	private static Singleton_4 INSTANCE = null;
	
	public static Singleton_4 newSingleton(){
		if(INSTANCE==null){//需要时才实例化
			synchronized(Singleton_4.class){
				if(INSTANCE==null){
					INSTANCE = new Singleton_4();
				}
			}
		}
		return INSTANCE;
	}
}

/********下面的问题的简述********/
/**下面来想一下，创建一个变量需要哪些步骤呢？一个是申请一块内存，调用构造方法进行初始化操作，
/**另一个是分配一个指针指向这块内存。这两个操作谁在前谁在后呢？
/**JVM规范并没有规定。那么就存在这么一种情况，JVM是先开辟出一块内存，然后把指针指向这块内存，最后调用构造方法进行初始化。
/**下面我们来考虑这么一种情况：线程A开始创建SingletonClass的实例，
/**此时线程B调用了getInstance()方法，首先判断instance是否为null。按照我们上面所说的内存模型，
/**A已经把instance指向了那块内存，只是还没有调用构造方法，因此B检测到instance不为null，
/**于是直接把instance返回了——问题出现了，尽管instance不为null，但它并没有构造完成，
/**就像一套房子已经给了你钥匙，但你并不能住进去，因为里面还没有收拾。
/**此时，如果B在A将instance构造完成之前就是用了这个实例，程序就会出现错误了！
 * 
 */

