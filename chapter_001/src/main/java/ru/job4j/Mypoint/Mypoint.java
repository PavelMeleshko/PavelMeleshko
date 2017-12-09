package ru.job4j.mypoint;

/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 08.12.2017
 */
public class mypoint {
    private int w;
    private int q;

    public mypoint(int w, int q) {
        this.w = w;
        this.q = q;
    }

    public double distanceTo(mypoint that) {
        return  Math.sqrt(Math.pow(this.w - that.w, 2) + Math.pow(this.q - that.q, 2));

    }

    public static void main (String[] args) {
        mypoint a = new mypoint(9,3);
        mypoint b = new mypoint(1,7);
    }
}
