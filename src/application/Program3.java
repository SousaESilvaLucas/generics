package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.services.SumService;

public class Program3 {

	public static void main(String[] args) {
		
		List <Shape> shapes = new ArrayList<>();
		
		shapes.add(new Circle(2.0));
		shapes.add(new Rectangle(2.0,1.0));
		shapes.add(new Rectangle(3.0,1.0));
		
		List <Double> doubles = new ArrayList<>();
		
		doubles.add(3.8);
		doubles.add(4.0);
		
		System.out.println("The total area is: " + SumService.totalArea(shapes));
	}

}
