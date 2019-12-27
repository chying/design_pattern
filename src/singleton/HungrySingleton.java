package singleton;
/**
 * ����ʽ
 * @author chying
 *
 */
public class HungrySingleton {
	
	private static HungrySingleton hsingleton = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return hsingleton;
	}
}
