package com.prodapt.week4;

import java.util.ArrayList;

public class TestBusinessLogicEmployee {

	public static void main(String[] args) {
		BusinessLogicEmployee be= new BusinessLogicEmployee();
		ArrayList<Employee> details=be.addDetails();
		be.processDetails(details);

	}

}
