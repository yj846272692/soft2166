package chapter09;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/9/18
 */
public class TV {
    int channel;
    int volumeLevel;
    boolean on;

    public TV() {
        super();
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    //切换频道
    public void channelUp() {
        this.channel++;
        if (channel > 120) {
            this.channel = 1;
        }
    }

    public void channelDown() {
        this.channel--;
        if (channel < 1) {
            this.channel = 120;
        }
    }

    //设置音量
    public void volumeUp() {
        if (on && volumeLevel < 100)
            volumeLevel++;
    }

    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }
}
