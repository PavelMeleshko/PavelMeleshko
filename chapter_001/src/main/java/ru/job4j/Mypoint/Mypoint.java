package ru.job4j.mypoint;

/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 08.12.2017
 */

public class Point {

     private int w;
     private int q;

     public Point(int w, int q) {
         this.w = w;
         this.q = q;
     }

     public double distanceTo(Point that) {
         Point a = this;
         Point b = that;

         int w1 = a.w;
         int q1 = a.q;
         int w2 = b.w;
         int q2 = b.q;
         double result = Math.sqrt(Math.pow(w2 - w1, 2) + Math.pow(q2 - q1, 2));
         return result;
     }

     public static void main (String[] args) {
         Point a = new Point(0,1);
         Point b = new Point(2,5);
         System.out.println("w1 = " + a.w);
         System.out.println("q1 = " + a.q);
         System.out.println("w2 = " + b.w);
         System.out.ptintln("q2 = " + b.q);

         double result = a.distanceTo(b);
         System.out.pintln("Рачтояние между точками А и В : " + result);
     }
}