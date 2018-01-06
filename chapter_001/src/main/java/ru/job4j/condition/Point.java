package ru.job4j.condition;
 
 /**
  * @author Pavel Meleshko (ottotiger@mail.ru)
  * @version 1
  * @since 09.12.2017
  */
 public class Point {
     private int w;
     private int q;
 
     public Point(int w, int q) {
         this.w = w;
         this.q = q;
     }
 
     public double distanceTo(Point that) {
         return  Math.sqrt(Math.pow(this.w - that.w, 2) + Math.pow(this.q - that.q, 2));
 
     }
 
     public static void main(String[] args) {
         Point a = new Point(9, 3);
         Point b = new Point(1, 7);
     }
 }