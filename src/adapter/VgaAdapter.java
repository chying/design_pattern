package adapter;
/**
 * 
 * ʵ��һ��VGA������,ͬ������ʵ��һ��HDMI������
 * ������ʵ�ַ�ʽ�����֣����ǵ�����ʵ�ַ�ʽ��
 * @author jstao
 *
 */
public class VgaAdapter extends Adapter{
    
    public void typec() {
        System.out.println("��Ϣ��Typec�ڵ��ֻ������");
    }
    
    public void typec2vga() {
        System.out.println("���յ�Type-c����Ϣ����Ϣת����VGA�ӿ���...");
        System.out.println("��Ϣ��ת����VGA�ӿڣ���ʾ�����ԶԽӡ�");
    }
}