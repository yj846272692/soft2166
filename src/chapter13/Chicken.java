package chapter13;

public class Chicken extends Animal implements Edible{
    @Override
    public String howToEat() {
        return "Chicken Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cook-a-doodle-doo";
    }
}
