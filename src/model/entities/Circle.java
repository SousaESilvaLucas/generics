package model.entities;

public class Circle implements Shape {

	private Double radius;
	
	
	
	public Circle(Double radius) {
		this.radius = radius;
	}



	@Override
	public Double area() {
		return Math.PI * radius * radius;
	}

}