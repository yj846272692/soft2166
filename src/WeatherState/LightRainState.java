package WeatherState;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/18
 */
public class LightRainState implements WeatherState {
    //【代码3】 重写public void showState()方法
    @Override
    public void showState() {
        System.out.println("小雨");

    }

}
