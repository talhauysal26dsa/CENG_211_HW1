package hw1_package;

public class Transaction {
	private int Id;
	private Product[] arrayOfThreeProducts;
	private double totalPrice;
	private double transactionFee;
	
	public Transaction(int Id, Product[] arrayOfProducts, double totalPrice, double transactionFee) {
		this.Id = Id;
		this.arrayOfThreeProducts = arrayOfProducts;
		this.totalPrice = totalPrice;
		this.transactionFee = transactionFee;	
		
	}
	
	public double getPrice() {
		return(totalPrice);
	}
	public double getTransactionFee() {
		return(transactionFee);
	}
	public Product[] getArrayOfThreeProducts() {
		return(arrayOfThreeProducts);
	}

}
