package edu.ejercicios;

import base.Pizza;
import base.Topping;
import especialidades.PizzaItaliana;
import interfaces.PizzaBase;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)

    {
//        PizzaItaliana pizza5 = new PizzaItaliana("italiana", 5, "Bufalo");
//        pizza5.addTopping(new Topping("Tomato"));
//        pizza5.addTopping(new Topping("Mozzarela"));
//        pizza5.prepare();
//        System.out.println("Esta es tu salsa" + pizza5.getSalsa());


//        PizzaBase pb = new PizzaBase("Carnes", 50);
//        pb.prepare();

        Pizza carne= new Pizza("Carnes");
        carne.addTopping(new Topping("mozzarela", 5));
        carne.addTopping(new Topping("bufalo", 25));
        carne.prepare();





    }
}

//REGLAS: quitar el price (double) y convertir en una funcion que me retorne el valor de la pizza
//en base a sus ingredientes y que me devuelva el valor total de la pizza (en linea)