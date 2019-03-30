package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T>{
	
	private List <T> values;
	
	
	
	public PrintService() {
		values = new ArrayList<>();
	}



	public void addValue (T value) {
		values.add(value);
		
	}
	
	public T first() {
		if (values.isEmpty()) {
			throw new IllegalStateException("List is Empty");
		}
		return values.get(0);
	}
	
	public void print() {
		if (!values.isEmpty()) {
			System.out.print("[");
			for (int i = 0; i < values.size(); i++) {
				System.out.print(values.get(i));
				if (i + 1 < values.size()) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
			System.out.println("First: " + first());
		}
		else {
			System.out.println("The list is empty");
		}
		
	}

}
