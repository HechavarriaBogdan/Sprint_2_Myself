package service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;

    }

    // получить общую сумму товаров в корзине без скидки

    public double getPriceWithoutDiscount() {
        double sum = 0;
        for (Food f : foods) {
            sum += f.totalPrice();
        }
        return sum;

    }

    // получить общую сумму товаров в корзине со скидкой


    public double getPriceWithDiscount() {
        double sum = 0;
        for (Food f : foods) {
            sum += f.totalPriceWithDiscount();
        }
        return sum;
    }

    // получить общую сумму всех вегетарианских продуктов в корзине без скидки

    public double getPriceVegetarian() {
        double sum = 0;
        for (Food f : foods) {
            if (f.isVegetarian()) {
                sum += f.totalPrice();
            }
        }
        return sum;
    }
}

