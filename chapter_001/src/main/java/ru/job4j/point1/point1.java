package ru.job4j.point1;

/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 09.12.2017
 */
public class point1 {
    private int w;
    private int q;

    public point1(int w, int q) {
        this.w = w;
        this.q = q;
    }

    public double distanceTo(point1 that) {
        return  Math.sqrt(Math.pow(this.w - that.w, 2) + Math.pow(this.q - that.q, 2));

    }

    public static void main (String[] args) {
        point1 a = new point1(9,3);
        point1 b = new point1(1,7);
    }
}
