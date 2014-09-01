package azeroth.horde.orgrimmar.singleton;
/**
 * ���ͬ����������ĵ���ģʽ
 * ������Ȼ��������
 * @author Administrator
 *
 */
public class Singleton_4 {
	
	private static Singleton_4 INSTANCE = null;
	
	public static Singleton_4 newSingleton(){
		if(INSTANCE==null){//��Ҫʱ��ʵ����
			synchronized(Singleton_4.class){
				if(INSTANCE==null){
					INSTANCE = new Singleton_4();
				}
			}
		}
		return INSTANCE;
	}
}

/********���������ļ���********/
/**��������һ�£�����һ��������Ҫ��Щ�����أ�һ��������һ���ڴ棬���ù��췽�����г�ʼ��������
/**��һ���Ƿ���һ��ָ��ָ������ڴ档����������˭��ǰ˭�ں��أ�
/**JVM�淶��û�й涨����ô�ʹ�����ôһ�������JVM���ȿ��ٳ�һ���ڴ棬Ȼ���ָ��ָ������ڴ棬�����ù��췽�����г�ʼ����
/**����������������ôһ��������߳�A��ʼ����SingletonClass��ʵ����
/**��ʱ�߳�B������getInstance()�����������ж�instance�Ƿ�Ϊnull����������������˵���ڴ�ģ�ͣ�
/**A�Ѿ���instanceָ�����ǿ��ڴ棬ֻ�ǻ�û�е��ù��췽�������B��⵽instance��Ϊnull��
/**����ֱ�Ӱ�instance�����ˡ�����������ˣ�����instance��Ϊnull��������û�й�����ɣ�
/**����һ�׷����Ѿ�������Կ�ף����㲢����ס��ȥ����Ϊ���滹û����ʰ��
/**��ʱ�����B��A��instance�������֮ǰ�����������ʵ��������ͻ���ִ����ˣ�
 * 
 */

