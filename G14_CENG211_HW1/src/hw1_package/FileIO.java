package hw1_package;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class FileIO {
	
	private Product[] products =  new Product[90];
	
	public FileIO() {
		
	}
	public Product[] readFile() {
	try (BufferedReader reader = new BufferedReader(new FileReader("products.csv"))) {
	    String line;
	    
	    int productCount = 0;
   
	    while ((line = reader.readLine()) != null) {
	    	StringTokenizer wordFinder = new StringTokenizer(line, ";");
	        // Process each line here
	    	while (wordFinder.hasMoreTokens()) {
	    		 String Id = wordFinder.nextToken();
	    		 String productName = wordFinder.nextToken();
	    		 String stringPrice = wordFinder.nextToken();
	    		 String modifiedString = stringPrice.replace(",", ".");
	    		 double price = Double.parseDouble(modifiedString);
	    		 Product product = new Product(Id, productName, price);
	    		
	    		 
	    		 products[productCount] = product;
	    		 
	    	}
	    	productCount++;
	        
	    }

	    } 
	 catch (IOException e) {
	    e.printStackTrace();}
	return products;

	}
		
	}





