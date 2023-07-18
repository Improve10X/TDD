package discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DiscountTest {
    private Discount discount;

    @BeforeEach
    public void setup() {
        discount = new Discount();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenDiscountZero_returnDiscountZero() {
        int totalDiscount = discount.findDiscount(0, 0);
        assertEquals(0, totalDiscount);
    }

    @Test
    public void givenDiscountMinus10_returnDiscountZero() {
        int totalDiscount = discount.findDiscount(-10, 2);
        assertEquals(Integer.MIN_VALUE, totalDiscount);
    }

    @Test
    public void givenPriceAndDiscount_returnTotalAmount() {
        int totalDiscount = discount.findDiscount(1500, 50);
        assertEquals(750, totalDiscount);
    }

    @Test
    public void givenPriceDiscount_returnTotalDiscount() {
        int totalDiscount = discount.findDiscount(89, 20);
        assertEquals(72, totalDiscount);
    }

    @Test
    public void givenPriceDiscountValues_returnTotalDiscount() {
        int totalDiscount = discount.findDiscount(100, 75);
        assertEquals(25, totalDiscount);
    }

    @Test
    public void givenPriceDiscountValue_returnTotalDiscount() {
        int totalDiscount = discount.findDiscount(1000, 75);
        assertEquals(250, totalDiscount);
    }
}
