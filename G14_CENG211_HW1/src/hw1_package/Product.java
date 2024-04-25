package hw1_package;

public class Product {
	private String ID;
    private String productName;
    private double price;

    public Product(String ID, String productName, double price) {
        this.ID = ID;
        this.productName = productName;
        this.price = price;

    }

    public String getName() {
        return productName;
    }
    public boolean equals(Product otherProduct) {

        return(productName == otherProduct.productName);


    }
    public double getProductPrice() {
        return price;
    }

    public String getID() {
        return ID;
    }
    public String toString() {
    	return(productName);
    }

}
