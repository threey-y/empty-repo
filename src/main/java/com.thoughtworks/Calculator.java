package com.thoughtworks;

import java.math.BigDecimal;

public class Calculator {
    Integer calculate(Goods goods) {
        int points = 0;
        points += goods.getPrice();
        return points;
    }
}
