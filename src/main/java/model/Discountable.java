package model;

import static model.constants.Discount.DEFAULT;

public interface Discountable {

    /**
     * Все классы, реализующие этот интерфейс,
     * возвращают значение 0 в методе getDiscount, если в задании не указано иное
     */

    default int getDiscount() {
        return DEFAULT;
    }
}
