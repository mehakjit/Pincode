package com.capg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyPincode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to pincode validation");
		Pattern pincode = Pattern.compile("^[1-9]{1}[0-9]{5}$");
		System.out.println("Enter the 6-digit pincode");
		String pattern = sc.nextLine();
		Matcher matcher = pincode.matcher(pattern);
		
		boolean isFound = matcher.find();
		if(isFound)
			System.out.println("Patter found");
		else
			System.out.println("Patter not found");
		
	}
}
