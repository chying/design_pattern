package adapter;
/**
 * 
 * 实现一个VGA适配器,同理还可以实现一个HDMI适配器
 * 适配器实现方式有三种，这是第三种实现方式。
 * @author jstao
 *
 */
public class VgaAdapter extends Adapter{
    
    public void typec() {
        System.out.println("信息从Typec口的手机输出。");
    }
    
    public void typec2vga() {
        System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
        System.out.println("信息已转换成VGA接口，显示屏可以对接。");
    }
}