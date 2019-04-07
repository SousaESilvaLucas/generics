package model.entities;

public class Rectangle implements Shape {
	
	private Double width;
	private Double height;
	
	
	
	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}



	public Double area() {
		return width * height;
	}

}
