package com.company;

import java.util.Random;
import java.util.function.*;

public class Main {

    /*sqrt деген метод тузунуз.
UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).

public static UnaryOperator<Double> sqrt().*/

    public static void main(String[] args) {


        System.out.println(sqrt.apply(30d));
    }

    public static UnaryOperator<Double> sqrt = Math :: sqrt;



}


