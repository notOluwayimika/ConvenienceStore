import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private Integer productId;
    private String productName;
    private Integer productQty;
    private double productPrice;
    private Integer stock;
    private Integer numberSold;
    public Product( String productName, Integer productQty, double productPrice, Integer stock) {
        this.productId= counter.incrementAndGet();
        this.productName=productName;
        this.productQty = productQty;
        this.productPrice=productPrice;
        this.stock = stock;
        this.numberSold=0;
    }

    public Integer getNumberSold() {
        return numberSold;
    }

    public void setNumberSold(Integer numberSold) {
        this.numberSold = numberSold;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQty() {
        return productQty;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }
}
