package color;

public class SquareTest {
    public static void main(String args[]) {
        CeometricObject[] cemoteric = {new Square(), new Square(),
                new Square(), new Square(), new Square()};
        for (int i = 0; i < cemoteric.length; i++) {
            if (cemoteric[i] instanceof Square) {
                Square s = (Square) cemoteric[i];
                s.howToColor();
            }
        }
    }
}
