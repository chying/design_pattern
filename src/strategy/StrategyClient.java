package strategy;

public class StrategyClient {

	public static void main(String[] args) {
		// ʹ�ù��캯��Ĭ��ѡ��һ��AWM�ѻ���ǹ��һ�����ԣ�
		Context context = new Context(new FirstGun());
		context.gun();

		// ʹ��get��set�����л���S12K����ǹ���л����ԣ�
		System.out.println("------��ǰ��30�׷��ֵ���------");
		context.setWeapon(new SecondGun());
		context.gun();
		// ʹ��get��set�����л���S12K����ǹ���л����ԣ�
	}
}