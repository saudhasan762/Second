package com.bibz;

public class Emplattend {

	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		double employeecheck=Math.floor(Math.random() * 10) % 2;
		if(employeecheck==IS_FULL_TIME) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}

	}

}
