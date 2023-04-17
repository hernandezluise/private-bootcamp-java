package com.caresoft.clinicapp;

import java.util.ArrayList;


public interface HIPAACompliantAdmin {
	
	abstract ArrayList<String> reportSecurityIncidents();
	
	public default void printSecurityIncidient() {
		System.out.println(reportSecurityIncidents());
	}
	
	public default boolean adminQATest(ArrayList<String> expectedIncidents) {
		if (reportSecurityIncidents().equals(expectedIncidents)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		return reportSecurityIncidents().equals(expectedIncidents);
	}
}
