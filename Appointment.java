package com.milestone;
import java.util.Date;
//require a uniqueUD > 10 or null and immutable
//require appointment Date, cannot be in the past or null
//description cannot be > 50 or null

public class Appointment {
    private final String apptID;
    private Date apptDate;
    private String apptDescription;


    //constructor
    public Appointment(String apptID, Date apptDate, String apptDescription){

        if (apptID == null || apptID.length() > 10) {
            throw new IllegalArgumentException("Invalid Appointment Id");
        }

        if (apptDescription == null || apptDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid description");
        }
        if (apptDate == null || apptDate.before(new Date())) {
            throw new IllegalArgumentException("Invalid Date");
        }

        this.apptID = apptID;
        this.apptDate = apptDate;
        this.apptDescription = apptDescription;

    }
    //getters and setters
    public String getApptID(){
        return apptID;
    }

    public Date getApptDate(){
        return apptDate;
    }
    //true or false if the Date is in the past

    public String getapptDescription(){
        return apptDescription;
    }
    public void setapptDescription(String apptDescription){
        this.apptDescription = apptDescription;
        if (apptDescription == null || apptDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid Appointment Name");
        }
    }

}
