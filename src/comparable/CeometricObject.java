package comparable;

public abstract class CeometricObject implements Comparable<CeometricObject> {

    public static CeometricObject Max(CeometricObject object1, CeometricObject object2) {
        if (object1.compareTo(object2) > 0)
            return object1;
        else
            return object2;
    }


    public abstract double getArea();

    @Override
    public abstract int compareTo(CeometricObject o);

}
