import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, RED);
        Apple appleGreen = new Apple(8, 60, GREEN);
        // Вызвали массив класса Food
        Food[] foods = new Food[]{meat, appleRed, appleGreen};
        // Вызвали объект класса ShoppingCart
        ShoppingCart cart = new ShoppingCart(foods);

        /**
        assert meat.getDiscount() == 0 : "actual value = " + meat.getDiscount();
        assert appleRed.getDiscount() == 60 : "actual value = " + appleRed.getDiscount();
        assert appleGreen.getDiscount() == 0 : "actual value = " + appleGreen.getDiscount();
        assert meat.totalPrice() == 500 : "actual value = " + meat.totalPrice();
        assert cart.getPriceWithoutDiscount() == 1480 : "actual value = " + cart.getPriceWithoutDiscount();
        assert cart.getPriceWithDiscount() == 1180 : "actual value = " + cart.getPriceWithDiscount();
        assert appleRed.totalPriceWithDiscount() == 200 : "actual value = " + appleRed.totalPriceWithDiscount();

        System.out.println("Количество мяса должно быть 5, получили " + meat.getAmount());
        System.out.println("Стоимость мяса должна быть 100, получили " + meat.getPrice());
        System.out.println("Итоговая цена мяса должа быть 500, получили " + meat.totalPrice());
        System.out.println("Итоговая цена красных яблок со скидкой " + appleRed.totalPriceWithDiscount());
        System.out.println("Итоговая цена зеленых яблок со скидкой " + appleGreen.totalPriceWithDiscount());
        System.out.println("Цена вегетарианских продуктов " + cart.getPriceVegetarian());

         */

        System.out.println("общая сумма товаров без скидки " + cart.getPriceWithoutDiscount());
        System.out.println("общая сумма товаров со скидкой " + cart.getPriceWithDiscount());
        System.out.println("сумм всех вегетарианских продуктов без скидки " + cart.getPriceVegetarian());
    }
}
