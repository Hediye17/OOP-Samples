package OOPSample;

public class Product {

    private String sku;
    private String productName;
    private Double price;

    public Product(String sku, String productName, Double price) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku){
        this.sku=sku;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
