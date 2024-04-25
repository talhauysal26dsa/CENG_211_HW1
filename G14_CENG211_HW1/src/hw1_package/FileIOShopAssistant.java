package hw1_package;
import java.io.BufferedReader;
import java.util.Random;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileIOShopAssistant {
	private ShopAssistant[] shopAssistants= new ShopAssistant[100];
	public FileIOShopAssistant() {
		
	}

	public ShopAssistant[] readFile() {
	try (BufferedReader reader = new BufferedReader(new FileReader("shopAssistants.csv"))) {
	    String line;
	    Random random = new Random();
	    int shopAssistantCount = 0;
	    while ((line = reader.readLine()) != null) {
	        // Process each line here
	        String[] values = line.split("\n");
	           
	        for (String value : values) {
	        	String[] types = value.split(";");
	        	String Id = types[0];
		        String assistantName = types[1];
		        String assistantSurname = types[2];
		        String assistantNumber = types[3];
		        int seniority = random.nextInt(16);
		        ShopAssistant shopAssistant = new ShopAssistant(Id, assistantName, assistantSurname, assistantNumber, seniority);
		        shopAssistants[shopAssistantCount] = shopAssistant;
		        shopAssistantCount ++;   
	        }	       
	    }
	    }
	catch (IOException e) {
	    e.printStackTrace();
	}
	return shopAssistants;	}
	



}





