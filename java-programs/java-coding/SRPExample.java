public class SRPExample {

    static class Book {
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

    // --- BookFormatter class: handles formatting logic ---
    static class BookFormatter {
        public String getFormattedTitle(Book book) {
            return "Title: " + book.getTitle().toUpperCase();
        }

        public String getFormattedAuthor(Book book) {
            return "Author: " + book.getAuthor();
        }
    }

    static class BookPriceCalculator {
        public double calculateDiscountedPrice(Book book, double discountPercentage) {
            if (discountPercentage < 0 || discountPercentage > 1) {
                throw new IllegalArgumentException("Discount must be between 0 and 1 (0% to 100%).");
            }
            return book.getPrice() * (1 - discountPercentage);
        }
    }

    public static void main(String[] args) {
        Book book = new Book(" Java", "Sushma", 45.00);

        BookFormatter formatter = new BookFormatter();
        BookPriceCalculator calculator = new BookPriceCalculator();

        System.out.println(formatter.getFormattedTitle(book));     // Output: Title in uppercase
        System.out.println(formatter.getFormattedAuthor(book));    // Output: Author
        System.out.println("Original Price: $" + book.getPrice());
        System.out.println("Discounted Price (10%): $" + calculator.calculateDiscountedPrice(book, 0.10));
    }
}