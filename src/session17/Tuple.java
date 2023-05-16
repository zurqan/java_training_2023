package session17;

public class Tuple<E, U> {

    public final E _1;
    public final U _2;

    public Tuple(E _1, U _2) {
        this._1 = _1;
        this._2 = _2;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "_1=" + _1 +
                ", _2=" + _2 +
                '}';
    }
}
