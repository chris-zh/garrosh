package azeroth.horde.orgrimmar.singleton;
/**
 * 
 * ʹ��enum�ؼ�����ʵ�ֵ���ģʽ�ĺô��������ǳ���࣬
 * �����޳����ṩ�����л����ƣ����Է�ֹ���ʵ������
 * ��ʹ������Ը��ӵ����л����߷��乥����ʱ�򡣡������ԡ�Effective Java��
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
