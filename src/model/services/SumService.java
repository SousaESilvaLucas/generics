package model.services;

import java.util.List;

import model.entities.Shape;

public class SumService {
	
	public static Double totalArea(List <? extends Shape> list) {
		Double sum = 0.0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).area();
		}
		return sum;
		

	}

}
