package adapter;

/**
 * ����һ����ʾ�� ���������Խ�
 * 
 * @author jstao
 *
 */
public class Screen {
	public static void main(String[] args) {
		// ��һ���������÷�
		System.out.println("-------------��һ��������------------");
		Vga vga = new Typec2Vga1();
		vga.vgaInterface();// ��������typecת����vga
		System.out.println("��ʾ���Խ����������ֻ��ɹ�ͶӰ����ʾ��!");

		// �ڶ����������÷�
		System.out.println("-------------�ڶ���������------------");
		Typec2Vga2 typec2Vga1 = new Typec2Vga2(new Phone());
		typec2Vga1.vgaInterface();// ��������typecת����vga
		System.out.println("��ʾ���Խ����������ֻ��ɹ�ͶӰ����ʾ��!");

		// �������������÷�
		System.out.println("-------------������������------------");
		VgaAdapter vgaAdapter = new VgaAdapter();
		vgaAdapter.typec();
		vgaAdapter.typec2vga();// ��������typecת����vga
		System.out.println("��ʾ���Խ����������ֻ��ɹ�ͶӰ����ʾ��!");
	}
}