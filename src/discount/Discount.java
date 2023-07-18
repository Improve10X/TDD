package discount;

public class Discount {
    public int findDiscount(int price, int discount) {
        int discountAmount = 0;
        int finalPrice = 0;
        if (price > 0) {
            discountAmount = price * discount / 100;
            finalPrice = price - discountAmount;
            return finalPrice;
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
