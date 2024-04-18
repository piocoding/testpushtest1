/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author sofiashahrir
 */
public class EventManager<T extends Event> {
    private ArrayList<T> events;
    
    public EventManager(){
        events = new ArrayList<>();
    }
    
    public void add(T e){
        events.add(e);
    }
    
    public void display(){
        for(T e: events){
            e.displayEventDetails();
        }
    }
}
