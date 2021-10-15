package chapter09;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/9/18
 */
public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV(8, 8, true);
        System.out.println("切换前：" + "频道：" + tv1.getChannel() + "音量：" + tv1.getVolumeLevel()
                + "On:" + tv1.isOn());
        tv1.channelDown();
        tv1.volumeDown();
        System.out.println("切换前：" + "频道：" + tv1.getChannel() + "音量：" + tv1.getVolumeLevel()
                + "On:" + tv1.isOn());

        System.out.println(new TV(2,20,false).toString());
    }
}
