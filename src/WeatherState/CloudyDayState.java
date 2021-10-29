package WeatherState;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/18
 */
public class CloudyDayState implements WeatherState {
    // 【代码1】重写public void showState()
    @Override
    public void showState() {
        System.out.println("多云");

    }

}
