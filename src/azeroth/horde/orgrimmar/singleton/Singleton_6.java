package azeroth.horde.orgrimmar.singleton;
/**
 * Effective Java�Ƽ���ʵ�ַ�ʽ
 * ֻ�е�����newSingleton����ʱ���ż����ڲ���SingletonInstance����ʱʵ����Singleton_6��
 * ����INSTANCE��static�����ֻ�ڼ���ʱʵ����һ��
 * ����SingletonInstance��˽�о�̬�ڲ��࣬���Բ��ᱻ������֪����ͬ����static����ҲҪ�󲻻��ж��ʵ�����ڡ�
 * ���ң�JSL�淶���壬��Ĺ��������ԭ���Եģ��ǲ����ģ���˲���Ҫ��ͬ���顣
 * ͬ����������������ǲ����ģ�����newSingleton()Ҳ������Ҫ��ͬ����
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
