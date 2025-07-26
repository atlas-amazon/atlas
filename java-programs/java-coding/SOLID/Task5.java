
public interface IProduct {
    void SeeReviews();
    void getSample();
}


public class Clothes implements IProduct {
    @Override
    public void SeeReviews() {
        System.out.println("Clothes Reviews: 4.5 stars");
    }

    @Override
    public void getSample() {
        System.out.println("Sample Clothes Displayed");
    }
}


public class Books implements IProduct {
    @Override
    public void SeeReviews() {
        System.out.println("Books Reviews: 4.7 stars");
    }

    @Override
    public void getSample() {
        System.out.println("Reading sample pages of the book");
    }
}


public class Cupboard {
    IProduct product;

    void addProduct(IProduct product) {
        this.product = product;
    }

    void customizeProduct() {
        product.SeeReviews();
        product.getSample();
    }
}