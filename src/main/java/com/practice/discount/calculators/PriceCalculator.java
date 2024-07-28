package com.practice.discount.calculators;

import com.practice.discount.exceptions.IncorrectFinalPriceException;

public interface PriceCalculator {
    double calculateFinalPrice(double price) throws IncorrectFinalPriceException;
}
