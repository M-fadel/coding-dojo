package com.caresoft.clinicapp;
import java.sql.Date;
import java.util.ArrayList;
public class AdminUser extends User implements HIPAACompliantUser,HIPAACompliantAdmin {

	public interface HIPAACompliantUser {
	    abstract boolean assignPin(int pin);
	    abstract boolean accessAuthorized(Integer confirmedAuthID);
	    
	}
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR T`HIS USER"
        );
        securityIncidents.add(report);
    }
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}
    
    // TO DO: Setters & Getters

	
}
