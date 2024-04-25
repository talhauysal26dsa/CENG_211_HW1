package hw1_package;
import java.util.Random;
public class TransactionManagement {
	private Transaction[] transactionArray;
	private Transaction[][] transactionArray_2d = new Transaction[100][15];
	private  Product[] transactionProducts;
	private  Product[] productArray;
	Random random = new Random();
	
	
	public TransactionManagement(Product[] productArray) {
		this.productArray = productArray;
		
		// TODO Auto-generated constructor stub
	}
	public Transaction[][] convertToMatrix(Transaction[] transactionArray){
		int t=0;
		for (int i = 0; i<100;i++) {
			for(int j=0; j<15; j++) {
				transactionArray_2d[i][j]=transactionArray[t];
				t++;
				
			}
		}
		return transactionArray_2d;
		
	}
	public Transaction[] convertToTransactionArray(Product[] products) {
		transactionArray=new Transaction[1500];
		int productLength = products.length;
		for (int i=0;i<1500;i++) {
		   	double transactionFee = 0;
		   	
		    int randomProductId = random.nextInt(productLength);
		    int randomProductId_1 = random.nextInt(productLength);
		    int randomProductId_2 = random.nextInt(productLength);
		    int randomProductQuantity = random.nextInt(10)+1;
		    int randomProductQuantity_1 = random.nextInt(10)+1;
		    int randomProductQuantity_2 = random.nextInt(10)+1;
		    int totalQuantity = randomProductQuantity+randomProductQuantity_1+randomProductQuantity_2;
		    transactionProducts = new Product[totalQuantity];
		    double totalPriceofFirstProduct = products[randomProductId].getProductPrice()*randomProductQuantity;
		    double totalPriceofSecondProduct = products[randomProductId_1].getProductPrice()*randomProductQuantity_1;
		    double totalPriceofThirdProduct = products[randomProductId_2].getProductPrice()*randomProductQuantity_2;
		    double totalPrice = totalPriceofFirstProduct+totalPriceofSecondProduct+totalPriceofThirdProduct;
		  
		    	for (int c=0 ; c<randomProductQuantity;c++) {
		    		transactionProducts[c] = products[randomProductId];
		    	}
		    	for (int f=randomProductQuantity ; f<randomProductQuantity+randomProductQuantity_1;f++) {
		    		transactionProducts[f] = products[randomProductId_1];
		    	}
		    	for (int g=randomProductQuantity+randomProductQuantity_1 ; g<totalQuantity;g++) {
		    		transactionProducts[g] = products[randomProductId_2];
		    	}
		
		    if (totalPrice <= 499) {
		    	transactionFee = (1.0/100.0)*totalPrice;}
		    else if((500 <= totalPrice)&& (totalPrice <= 799))
		    {
		    	transactionFee = totalPrice*(3.0/100.0);
		    	}
		    else if ((800 <= totalPrice)&&(totalPrice<= 999)) 
		    {
		    	transactionFee = totalPrice*(5.0/100.0);
		    }
		    else {
		    	transactionFee = totalPrice*(9.0/100.0);}
		    	
		    Transaction transaction = new Transaction(i, transactionProducts, totalPrice, transactionFee);
		    transactionArray[i] = transaction;  
		   
	   }
		return transactionArray;
	} 
	
	

}
