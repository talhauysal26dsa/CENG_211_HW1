package hw1_package;

public class SalaryManagement {
	private double[] shopAssistantSalaryArray = new double[100];
	private double[] shopAssistantSalesArray = new double[100];
	private double[] shopAssistantWeeklySalaryArray = new double[100];
	private double[] shopAssistantCommissionArray = new double[100];
	private ShopAssistant[] shopAssistant;
	private Transaction[][] transactionArray_2d;
	public SalaryManagement(ShopAssistant[] shopAssistant, Transaction[][] transactionArray_2d) {
		this.shopAssistant = shopAssistant;
		this.transactionArray_2d = transactionArray_2d;
		

	}
public double[] computeSales(Transaction[][] transactionArray_2d) {
		
		for (int i=0; i<transactionArray_2d.length;i++) {
			int totalPriceOfOneShopAssistant = 0;
			for(int j=0; j<transactionArray_2d[0].length;j++) {
				totalPriceOfOneShopAssistant += transactionArray_2d[i][j].getPrice();
				
			}
			shopAssistantSalesArray[i] = totalPriceOfOneShopAssistant; 
		}
		return shopAssistantSalesArray;

	}
public double[] computeCommissions(double[] shopAssistantSalesArray) {
	
	for (int i=0; i<shopAssistantSalesArray.length;i++) {
		double salary = 0;
		double sale = shopAssistantSalesArray[i];
		if(sale >7500) {
			salary += (3.0/100.0)*sale;
		}
		else {
			salary += (1.0/100.0)*sale;
		}
		shopAssistantCommissionArray[i] = salary;
		
	}
	return shopAssistantCommissionArray;
	
}
public double[] computeWeeklySalary(ShopAssistant[] shopAssistant) {
	
	for (int i =0;i<shopAssistant.length;i++) {
		double weeklySalary = 0;
		
		int seniority = shopAssistant[i].getSeniority();
		if (seniority<1) {
			weeklySalary = 1500;
			
		}
		else if((1<=seniority)&&(seniority<3)) {
			weeklySalary = 2000;
			
		}
		else if((3<=seniority)&&(seniority<5)) {
			weeklySalary = 2500;
			
		}
		else if(seniority>=5) {
			weeklySalary = 3000;
			
		}
		
		shopAssistantWeeklySalaryArray[i] = weeklySalary;
		
		
	}
	return shopAssistantWeeklySalaryArray;
	
}
public double[] computeSalary(double[] shopAssistantWeeklySalaryArray, double[] shopAssistantCommissionArray) {
	int length = shopAssistantWeeklySalaryArray.length;
	double totalSalary = 0;
	for (int i =0;i<length;i++) {
		totalSalary = 4*shopAssistantWeeklySalaryArray[i]+shopAssistantCommissionArray[i];
		shopAssistantSalaryArray[i] = totalSalary;
		
		
		
	}
	return shopAssistantSalaryArray;

	
}

	
	}
	
	
	

