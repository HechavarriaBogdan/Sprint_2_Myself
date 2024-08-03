package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {

    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    /**
     * Для красных яблок (colour равно "red") скидка должна быть равна 60%:
     * соответствующий метод возвращает значение 60.
     */

    @Override
    public int getDiscount() {
        if (this.colour.equals(RED)) {
            return DISCOUNT;
        } else {
            return super.getDiscount();
        }
    }
}
