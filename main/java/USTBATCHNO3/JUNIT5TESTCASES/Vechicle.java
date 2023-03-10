package USTBATCHNO3.JUNIT5TESTCASES;

import java.util.Scanner;

public class Vechicle {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		String state = "KL";
		String district;
		System.out.println("Enter the sub number : ");
		int dis = n.nextInt();
		switch(dis) {
		case 1: district = "Thiruvananthapuram";
				break;
		case 2: district = "Kollam";
				break;
		case 3: district = "Pathanamthitta";
				break;
		case 4: district = "Alapuzha";
				break;
		case 5: district = "Kottayam";
				break;
		case 6: district = "Idukki";
				break;
		case 7: district = "Ernakulam";
				break;
		case 8: district = "Thrissur";
				break;
		default: System.out.println("invalid code");
		        break;
		}
	}

}

