package singleton;

/**
 * ÀÁººÊ½
 * 
 * @author chying
 *
 */
public class LazySingleton_sync {

	private static LazySingleton_sync singleton;

	private LazySingleton_sync() {

	}

	/**
	 * Ð§ÂÊµÍ
	 * 
	 * @return
	 */
	public static synchronized LazySingleton_sync getInstance() {
		if (singleton == null) {
			singleton = new LazySingleton_sync();
		}
		return singleton;
	}

}
