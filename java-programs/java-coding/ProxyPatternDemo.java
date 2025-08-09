public class ProxyPatternDemo {

    interface Image {
        void display();
    }

    static class RealImage implements Image {
        private String filename;

        public RealImage(String filename) {
            this.filename = filename;
            loadFromDisk();
        }

        private void loadFromDisk() {
            System.out.println("Loading " + filename);
        }

        @Override
        public void display() {
            System.out.println("Displaying " + filename);
        }
    }

    static class ProxyImage implements Image {
        private RealImage realImage;
        private String filename;

        public ProxyImage(String filename) {
            this.filename = filename;
        }

        @Override
        public void display() {
            if (realImage == null) {
                realImage = new RealImage(filename); // Lazy loading
            }
            realImage.display();
        }
    }

    public static void main(String[] args) {
        Image image = new ProxyImage("myphoto.jpg");

        System.out.println("First call to display():");
        image.display();  

        System.out.println("\nSecond call to display():");
        image.display();
    }
}