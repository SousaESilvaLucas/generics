package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.services.CalculationService;

public class Program2 {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		String path = "//home//lucas//eclipse-workspace//generics//in";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				products.add(new Product(line.split(",")[0],
						Double.valueOf(line.split(",")[1])));
				line = br.readLine();
			}
			
			System.out.println();
			System.out.println("Most expensive: ");
			Product mostExpensive = CalculationService.max(products);
			System.out.println(mostExpensive.getName() + ", " + mostExpensive.getPrice());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
