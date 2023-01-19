package com.ironhack.lab.main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        BigDecimal numberOne = new BigDecimal("4.2545");
        BigDecimal numberTwo = new BigDecimal("8.8");

        System.out.println(roundedNumber(numberOne));
        positiveToNegative(numberTwo);

    }

    public static BigDecimal roundedNumber(BigDecimal number){
        return number.setScale(2, RoundingMode.HALF_DOWN);

    }

    public static BigDecimal positiveToNegative(BigDecimal number){
        if (number.compareTo(BigDecimal.ZERO)>0){
            return

        }

    }
}
