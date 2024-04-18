/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventmanagementsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sofiashahrir
 */
public class EventManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EventManager manager = new EventManager();
        
        try {
            Scanner in = new Scanner( new FileInputStream("/Users/sofiashahrir/Downloads/events.txt"));
            while(in.hasNextLine()){
                String line = in.nextLine();
                String[] temp = line.split(",");
                if(temp[0].equals("Concert")) manager.add(new Concert(temp[1], temp[2], temp[3], temp[4]));
                else if(temp[0].equals("Workshop")) manager.add(new Workshop(temp[1], temp[2], temp[3], temp[4], temp[5]));
                else if(temp[0].equals("SportsGame")) manager.add(new SportsGame(temp[1], temp[2], temp[3], temp[4]));
            }
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        
        manager.display();
        
    }
    
}
