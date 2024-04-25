package hw1_package;

public class SalesManagementApp {

	
	public static void main(String[] args) {
		FileIO fileIOproduct = new FileIO();
		FileIOShopAssistant fileIOshopAssistant = new FileIOShopAssistant();
		ShopAssistant[] shopAssistantArray = fileIOshopAssistant.readFile();
		Product[] productArray = fileIOproduct.readFile();
		TransactionManagement transactionManagement = new TransactionManagement(productArray);
		Transaction[] transactionArray = transactionManagement.convertToTransactionArray(productArray);
		Transaction[][] transaction2DArray = transactionManagement.convertToMatrix(transactionArray);
		
		SalaryManagement salaryManagement = new SalaryManagement(shopAssistantArray, transaction2DArray);
		
		double[] shopAssistantSalesArray = salaryManagement.computeSales(transaction2DArray);
		
		double[] shopAssistantCommissionArray= salaryManagement.computeCommissions(shopAssistantSalesArray);
		
		double[] shopAssistantWeeklySalaryArray = salaryManagement.computeWeeklySalary(shopAssistantArray);
		double[] shopAssistantSalaryArray = salaryManagement.computeSalary(shopAssistantWeeklySalaryArray, shopAssistantCommissionArray);
		Query query = new Query();
		System.out.println("Highest Total Price is " + String.format("%.2f", query.highestTransactionPrice(transactionArray))+"\n");
		 System.out.println("The most expensive product in the lowest price transaction is " + query.lowestTransactionExpensiveProduct(transactionArray)+"\n");
		 System.out.println("The lowest transaction fee is " + String.format("%.2f", query.lowestTransactioFee(transactionArray))+"\n");
		 query.highestSalaryShopAssistant(shopAssistantSalaryArray, shopAssistantArray, shopAssistantWeeklySalaryArray, shopAssistantCommissionArray);
		 System.out.println("Total revenue earned " +  String.format("%.2f", query.totalPriceOfAllTransactions(transactionArray))+"\n");
		 System.out.println("Total profit is " + String.format("%.2f", query.calculateProfit(shopAssistantSalesArray, shopAssistantSalaryArray, transactionArray)));		 
	

	}
	
}
