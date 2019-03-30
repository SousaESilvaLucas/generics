package model.services;

import java.util.Collections;
import java.util.List;

public class CalculationService {

	public static <T extends Comparable <T>> T max(List <T> Ts) {
		
		return Collections.max(Ts);
	}
}
