package chapter09.computer;

/**
 * @author YG.
 * @description: 主类Test
 * @DATE: 2021/10/1
 */
public class Test {

    public static void main(String args[]) {
        CPU cpu = new CPU();
        HardDisk disk = new HardDisk();
        cpu.setSpeed(2200);
        disk.setAmount(200);
        PC pc = new PC();
        //调用setCPU方法
        pc.setCPU(cpu);
        //调用setHardDisk方法
        pc.setHardDisk(disk);
        //调用show方法
        pc.show();
    }
}
