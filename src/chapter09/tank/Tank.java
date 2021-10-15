package chapter09.tank;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/1
 */
public class Tank {
    //声明double型变量speed,刻画速度 [代码1]
    double speed;
    //声明int型变量bulletAmount,刻画炮弹数量[代码2]
    int bulletAmount;

    void speedUp(int s) {
        //将s+speed赋值给speed[代码3]
        speed = s + speed;

    }

    void speedDown(int d) {
        if (speed - d >= 0)
            //将speed-d赋值给speed  [代码4]
            speed = speed - d;
        else {
            speed = 0;

        }
    }

    int getBulletAmount() {
        return bulletAmount;
    }

    void setBulletAmount(int m) {
        bulletAmount = m;
    }

    double getSpeed() {
        return speed;
    }

    void fire() {
        if (bulletAmount >= 1) {
            //将bulletAmount-1赋值给bulletAmount  [代码5]
            
            bulletAmount = bulletAmount - 1;
            System.out.println("打出一发炮弹");
        } else {
            System.out.println("没有炮弹了,无法开火");
        }
    }
}



