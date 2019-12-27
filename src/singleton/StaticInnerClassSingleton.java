package singleton;

/**
 * ��̬�ڲ���д��
 * 
 * @author chying
 *
 */
public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton() {
	}

	private static class SingletonInstance {
		private static final StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
	}

	public static StaticInnerClassSingleton getInstance() {
		return SingletonInstance.singleton;
	}
}
