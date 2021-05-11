package main;

public class ChildrenPriceCategory  extends PriceCategory {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getPrice(int daysRented) {
        double price = 1.5;
        if (daysRented > 3)
             price+= (daysRented - 3) * 1.5;
        return price;
    }
}
