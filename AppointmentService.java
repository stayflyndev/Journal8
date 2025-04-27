package com.milestone;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class AppointmentService {

    private Map<String, Appointment> apptMap;

    public AppointmentService() {
        apptMap = new HashMap<>();
    }

    public Appointment getAppt(String apptID) {
        Appointment appt = apptMap.get(apptID);
        if (appt == null) {
            throw new IllegalArgumentException("Appointment not found.");
        }
        return appt;
    }
    public void addAppointment(String apptID, Date apptDate, String apptDescription) {
        if (apptMap.containsKey(apptID)) {
            throw new IllegalArgumentException("Appointment with this ID already exists.");
        }

        Appointment newAppointment = new Appointment(apptID, apptDate, apptDescription);
        apptMap.put(apptID, newAppointment);
    }

    // Remove an existing contact by ID
    public void removeAppointment(String contactID) {
        if (!apptMap.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact not found.");
        }

        apptMap.remove(contactID);
    }



}
