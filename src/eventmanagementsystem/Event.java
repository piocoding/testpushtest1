/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagementsystem;

/**
 *
 * @author sofiashahrir
 */
public abstract class Event {
    protected String eventId, eventName, eventDate;
    
    public Event(String id, String name, String date){
        eventId = id;
        eventName = name;
        eventDate = date;
    }
    
    public String getEventId(){ return eventId; }
    public String getEventName(){ return eventName; }
    public String getEventDate(){ return eventDate; }
    
    public abstract void displayEventDetails();
}
