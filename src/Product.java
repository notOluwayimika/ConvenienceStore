public class Product {
    private String productId;
    private String productName;
    private Integer productQty;
    private double productPrice;
    public Product(String productId, String productName, Integer productQty, double productPrice) {
        this.productId=productId;
        this.productName=productName;
        this.productQty = productQty;
        this.productPrice=productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public Integer getProductQty() {
        return productQty;
    }

    public String getProductId() {
        return productId;
    }
}
