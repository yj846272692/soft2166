package WeatherState;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/18
 */
public class Weather {
    WeatherState state;

    public void show() {
        state.showState();
    }

    public void setState(WeatherState s) {
        state = s;
    }


}
