package adapter;

/**
 * 
 * ʵ��һ��Type-cתVGA��������
 * ������ʵ�ַ�ʽ�����֣����ǵڶ���ʵ�ַ�ʽ��
 * @author jstao
 *
 */
public class Typec2Vga2 implements Vga{

    private Phone phone;
    
    public Typec2Vga2(Phone phone) {
        // TODO Auto-generated constructor stub
        this.phone = phone;
    }
    
    @Override
    public void vgaInterface() {
        // TODO Auto-generated method stub
        if(phone != null) {
            phone.typecPhone();
            System.out.println("���յ�Type-c����Ϣ����Ϣת����VGA�ӿ���...");
            System.out.println("��Ϣ��ת����VGA�ӿڣ���ʾ�����ԶԽӡ�");
        }
    }
}
