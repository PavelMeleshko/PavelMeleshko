package ru.job4j.calculator;


/**
* Class 


* @author Pavel Meleshko (ottotige@mail.ru)


* @version 1


* @since 04.12.2017


*/




public class Calculator {
     

 

     private double result;

    

     
     public void add(double first, double second) {
       

             this.result = first + second;
    
     }

     public void sub(double first, double second) {
             this.result = first - second;
     }
 
     public void mul(double first, double second) {
             this.result = first * second;
     }

     public void div(double first, double second) {
             if (second == 0) {
                  throw new IllegalArgumentException("Number can not be divede by 0!");
             }   
             this.result = first / second;
     }  

     
public double getResult() {
       

         return this.result;
    

     }
} 
  

