package WeatherState;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/18
 */
public class HeavyRainState implements WeatherState {
    //  【代码2】重写public void showState()
    @Override
    public void showState() {
        System.out.println("大雨");

    }

}
