package com.task1;

public class Burger {
    boolean hasBun;
    boolean hasMeat;
    boolean hasCheese;
    boolean hasGreenery;
    boolean hasMayonnaise;
    boolean hasSecondMeat;

    public Burger(boolean hasBun, boolean hasMeat, boolean hasCheese,
                  boolean hasGreenery, boolean hasMayonnaise) {
        this.hasBun = hasBun;
        this.hasMeat = hasMeat;
        this.hasCheese = hasCheese;
        this.hasGreenery = hasGreenery;
        this.hasMayonnaise = hasMayonnaise;
        if (hasBun && hasMeat && hasCheese && hasGreenery && hasMayonnaise) {
            System.out.println("Recipe of common burger: bun x1, meat x1, cheese x1, greenery x1, mayonnaise x1");
            System.out.println();
        }

    }

    public Burger(boolean hasBun, boolean hasMeat, boolean hasCheese,
                  boolean hasGreenery, boolean hasMayonnaise, boolean hasSecondMeat) {
        this.hasBun = hasBun;
        this.hasMeat = hasMeat;
        this.hasCheese = hasCheese;
        this.hasGreenery = hasGreenery;
        this.hasMayonnaise = hasMayonnaise;
        this.hasSecondMeat = hasSecondMeat;
        if (hasBun && hasMeat && hasCheese && hasGreenery && hasMayonnaise && hasSecondMeat) {
            System.out.println("Recipe of double-meat burger: bun x1, meat x2, cheese x1, greenery x1, mayonnaise x1");
            System.out.println();
        }

    }

    public Burger(boolean hasBun, boolean hasMeat, boolean hasCheese, boolean hasGreenery) {
        this.hasBun = hasBun;
        this.hasMeat = hasMeat;
        this.hasCheese = hasCheese;
        this.hasGreenery = hasGreenery;
        if (hasBun && !hasMeat && hasCheese && hasGreenery) {
            System.out.println("Recipe of diet burger: bun x1, meat x1, cheese x1, greenery x1");
            System.out.println();
        }

    }


}
