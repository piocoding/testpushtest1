/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagementsystem;

/**
 *
 * @author sofiashahrir
 */
public class Workshop extends Event{

    private String topic, instructor;
    
    public Workshop(String id, String name, String date, String topic, String instr){
        super(id, name, date);
        this.topic = topic;
        instructor = instr;
    }
    
    public String getTopic(){ return topic; }
    public String getInstructor(){ return instructor; }
    
    @Override
    public void displayEventDetails() {
        System.out.println("Workshop -"
                + " ID: " + getEventId()
                + ", Name: " + getEventName()
                + ", Date: " + getEventDate()
                + ", Topic: " + getTopic()
                + ", Instructor: " + getInstructor());
    }
    
    
}
