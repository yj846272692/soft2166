package chapter09.computer;

/**
 * @author YG.
 * @description: 组合CPU和HardDisk的对象
 * @DATE: 2021/10/1
 */
public class PC {
    HardDisk HD;
    CPU cpu;

    void setCPU(CPU c) {
        cpu = c;
    }

    void setHardDisk(HardDisk h) {
        HD = h;
    }

    //show方法
    void show() {
        System.out.println("CPU的速度是" + cpu.getSpeed());
        System.out.println("硬盘的容量是" + HD.getAmount());
    }

}
