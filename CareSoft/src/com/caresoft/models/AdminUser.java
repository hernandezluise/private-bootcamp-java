package com.caresoft.models;

import java.util.ArrayList;
import java.util.Date;

import com.caresoft.clinicapp.HIPAACompliantAdmin;
import com.caresoft.clinicapp.HIPAACompliantUser;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private String role;
	private ArrayList<String> securityIncidents;
	
	public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
		this.securityIncidents = new ArrayList<String>();
	}
	
	public void newIncident(String notes) {
		String report = String.format("Datetime Submitted: %s \n, Reported By ID: %s \n", new Date(), this.id, notes);
		securityIncidents.add(report);
	}
	
	public void authIncident() {
		String report = String.format("Datetime Submitted: %s \n, ID: %s \n", new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER!!");
		securityIncidents.add(report);
	}
	
	
	@Override
	public boolean assignPin(int pin) {
		if (pin < 100000 || pin > 999999) {
			return false;
		}
		this.pin = pin;
		return true;
	}
	
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID != this.id) {
			this.authIncident();
			return false;
		}
		return true;
	}
	
	@Override 
	public ArrayList<String> reportSecurityIncidents(){
		return this.securityIncidents;
	}
}