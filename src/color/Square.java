package color;

public class Square extends CeometricObject implements Colorable{
    @Override
    public void howToColor() {
        System.out.println("对象是可着色的");
    }
}
