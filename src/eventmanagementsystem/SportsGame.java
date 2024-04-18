/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagementsystem;

/**
 *
 * @author sofiashahrir
 */
public class SportsGame extends Event{

    private String gameType;
    
    public SportsGame(String id, String name, String date, String type){
        super(id, name, date);
        gameType = type;
    }
    
    public String getGameType(){ return gameType; }
    
    @Override
    public void displayEventDetails() {
        System.out.println("Sports Game -"
                + " ID: " + getEventId()
                + ", Name: " + getEventName()
                + ", Date: " + getEventDate()
                + ", Type: " + getGameType());
    }
    
}
