public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

public class BookFormatter {
    public String getFormattedTitle(Book book) {
        return "Title: " + book.getTitle().toUpperCase();
    }
}

public class PricingCalculator {
    public double calculateDiscountedPrice(double originalPrice, double discountPercentage) {
        return originalPrice * (1 - discountPercentage);
    }
}