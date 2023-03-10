package USTBATCHNO3.JUNIT5TESTCASES;

import java.time.LocalDate;

public class Empgoldcoins {

	public String  findcoins(LocalDate date) {
		int dayOfYear=date.getDayOfYear();
		
		if (dayOfYear<80) {
			return "*****";
		}else if (dayOfYear<172) {
			return "***";
		}else if (dayOfYear<266) {
		return "*";

	}
		return null;
	}
}
	   

