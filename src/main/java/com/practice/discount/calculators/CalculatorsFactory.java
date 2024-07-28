package com.practice.discount.calculators;

import com.practice.discount.calculators.types.Calculator;
import com.practice.discount.exceptions.IncorrectDiscountException;

public class CalculatorsFactory {
    public static DiscountCalculator makeNewDiscount(
            final int discount
    ) throws IncorrectDiscountException {
        return new DiscountCalculator(discount);
    }

    public static SaleCalculator makeNewSale(
            final int discount
    ) throws IncorrectDiscountException {
        return new SaleCalculator(discount);
    }

    public static Calculator makeNewCalculator(
            final PriceCalculator calculator, final String name
    ) {
        return new Calculator(calculator, name);
    }
}
