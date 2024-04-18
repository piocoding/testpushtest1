/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagementsystem;

/**
 *
 * @author sofiashahrir
 */
public class Concert extends Event{

    private String bandName;
    
    public Concert(String id, String name, String date, String band){
        super(id, name, date);
        bandName = band;
    }
    
    public String getBandName(){ return bandName; }
    
    @Override
    public void displayEventDetails() {
        System.out.println("Concert -"
                + " ID: " + getEventId()
                + ", Name: " + getEventName()
                + ", Date: " + getEventDate()
                + ", Band: " + getBandName());
    }
    
}
