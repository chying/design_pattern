package adapter;

/**
 * 
 * ʵ��һ��Type-cתVGA��������
 * ������ʵ�ַ�ʽ�����֣����ǵ�һ��ʵ�ַ�ʽ��
 * @author jstao
 *
 */
public class Typec2Vga1 extends Phone implements Vga{
    @Override
    public void vgaInterface() {
        // TODO Auto-generated method stub
        typecPhone();
        System.out.println("���յ�Type-c����Ϣ����Ϣת����VGA�ӿ���...");
        System.out.println("��Ϣ��ת����VGA�ӿڣ���ʾ�����ԶԽӡ�");
    }
}