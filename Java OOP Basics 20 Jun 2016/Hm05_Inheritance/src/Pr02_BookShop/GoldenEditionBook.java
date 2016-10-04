package Pr02_BookShop;

public class GoldenEditionBook extends Book{

    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    protected void setPrice(double price) {
        super.setPrice(price + price * 0.3);
    }
}
