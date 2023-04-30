public class ProductClass {
    private double price;
    private String productDescription;
    private double weight;

    public ProductClass(String productDescription, double price, double weight) {
        this.price = price;
        this.productDescription = productDescription;
        this.weight = weight;
    }

    public ProductClass() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "[Product description : " + productDescription + ", price : $" + price + ", weight : kg" + weight + "]";
    }
}