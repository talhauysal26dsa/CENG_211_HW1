package hw1_package;

public class Query {
	
	public double calculateProfit(double[] shopAssistantSalesArray,double[] shopAssistantSalaryArray, Transaction[] transactionArray) {	
	int length = shopAssistantSalesArray.length;
	double income = totalPriceOfAllTransactions(transactionArray);
	double outcome = 0.0;
	for (int i =0; i<length;i++) {
		outcome += shopAssistantSalaryArray[i];
		
	}
	double profit = income-outcome;
	return profit;
	}
	
	
	public double totalPriceOfAllTransactions(Transaction[] transactionArray) {
		double totalPrice = 0.0;
		int length = transactionArray.length;
		for (int i=0; i<length;i++) {
			
			totalPrice += transactionArray[i].getPrice() +transactionArray[i].getTransactionFee();
		}
		return totalPrice;
		
        }
		
	public void highestSalaryShopAssistant(double[] shopAssistantSalaryArray,
			ShopAssistant[] shopAssistantArray,
			double[] shopAssistantWeeklySalaryArray,
			double[] shopAssistantCommissionArray) {
		double maxSalary = Double.MIN_VALUE; 
        int maxSalaryIndex = -1; 
       

        
        for (int i = 0; i < shopAssistantSalaryArray.length; i++) {
            double currentSalary = shopAssistantSalaryArray[i];
            if (currentSalary > maxSalary) {
                maxSalary = currentSalary; // Update maxPrice if a higher price is found
                maxSalaryIndex = i; // Update maxPriceIndex with the position of the transaction
            }
        }
        ShopAssistant shopAssistant =  shopAssistantArray[maxSalaryIndex];
        
        
        System.out.println("The highest salary shop assistant "+"\n"+
        "ID "+
        shopAssistant.getId()+"\n"+ 
        "Name "+ 
        shopAssistant.toString()+"\n"+
        "Seniority "+
        shopAssistant.getSeniority() + "\n" +
        "Weekly Salary " +
    	shopAssistantWeeklySalaryArray[maxSalaryIndex]+"\n"+
        "Commision "+
        shopAssistantCommissionArray[maxSalaryIndex]+"\n"+
        "Salary "
        +maxSalary+"\n");
        
       
        }
		
	
	
	public double highestTransactionPrice(Transaction[] transactionArray) {
		double maxPrice = 0;
		
		 for (Transaction transaction : transactionArray) {
	            double currentPrice = transaction.getPrice();
	            if (currentPrice > maxPrice) {
	                maxPrice = currentPrice;                	
	            }                       
	        }
		
		 return maxPrice;
	}
	
	public String lowestTransactionExpensiveProduct(Transaction[] transactionArray) {
		double minPrice = Double.MAX_VALUE; 
        Transaction minPriceTransaction = null;    
        for (Transaction transaction : transactionArray) {
            double currentPrice = transaction.getPrice();
            if (currentPrice < minPrice) {
                minPrice = currentPrice; 
                minPriceTransaction = transaction;}
	}
        Product[] transactionProducts = minPriceTransaction.getArrayOfThreeProducts();
        double maxPrice = 0;
        Product maxPriceProduct = null;
        for (Product product : transactionProducts) {
        	double currentPrice = product.getProductPrice();
            if (currentPrice > maxPrice) {
                maxPrice = currentPrice;
                maxPriceProduct = product;          	
            }
      	
        }
        return maxPriceProduct.getName();
	}
	
	public double lowestTransactioFee(Transaction[] transactionArray) {
		double minFee = Double.MAX_VALUE; 
            
        for (Transaction transaction : transactionArray) {
            double currentFee = transaction.getTransactionFee();
            if (currentFee < minFee) {
                minFee = currentFee;           
                }
            }
        return minFee;
        }
}
