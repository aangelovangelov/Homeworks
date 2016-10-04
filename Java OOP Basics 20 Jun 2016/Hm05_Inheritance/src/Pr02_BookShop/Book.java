package Pr02_BookShop;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book(String author, String title, double price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    protected String getTitle() {
        return title;
    }

    protected String getAuthor() {
        return author;
    }

    protected double getPrice() {
        return price;
    }

    protected void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    protected void setAuthor(String author) {
        String[] authorName = author.split("\\s+");
        if (authorName.length != 1) {
            String secondName = authorName[1];
            if (Character.isDigit(secondName.charAt(0))) {
                throw new IllegalArgumentException("Author not valid!");
            }
        }
        this.author = author;
    }

    protected void setPrice(double price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.title)
                .append(System.lineSeparator())
                .append("Author: ").append(this.author)
                .append(System.lineSeparator())
                .append("Price: ").append(this.price)
                .append(System.lineSeparator());
        return sb.toString();
    }
}
