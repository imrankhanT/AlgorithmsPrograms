package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class tempratureConversion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter how the value you want: ");
		float temperatur=scan.nextFloat();
		boolean check=true;
		do{
			System.out.println("you want convert  \"Fahrenheit to Celsius\" then press \"c\" or vice versa press \"f\"");
			
			String typeOfTemperatur=scan.next().toLowerCase();
			if(typeOfTemperatur.equalsIgnoreCase("c")){
				System.out.println("The Temperatu is: "+utility.temperaturConversion(temperatur,"c")+" Degree Celsius ");
				check=false;
			}
			else{
					//String checkFahrenheit=scan.next().toLowerCase();
				    if(typeOfTemperatur.equalsIgnoreCase("f")){
				    	System.out.println("The Temperatu is : "+utility.temperaturConversion(temperatur,"f")+" Fahrenheits");
				    	check=false;
				    }
				    else{
				    	System.out.println("Wrong Choice please enter again:");
				    	check=true;
				    }
			}
		}while(check==true);

	}
}
