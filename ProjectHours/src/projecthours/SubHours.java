/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecthours;

/**
 *
 * @author Fujoshi Shouter
 */
public class SubHours {
    
    private int hour;
    private int minute;
    private int second;
    
    //constructor #1
    public SubHours(){
        
        hour = 0;
        minute = 0;
        second = 0;
        
    }
    
    //constructor #2
    public SubHours(int hour){
    
        this.hour = hour;
        minute = 0;
        second = 0;
        
    }
    
    //constructor #3
    public SubHours(int hour, int minute){
    
        this.hour = hour;
        this.minute = minute;
        second = 0;
        
    }
    
    //constructor #4
    public SubHours(int hour, int minute, int second){
    
        if ( 0 <= hour & hour < 24 ){
            this.hour = hour;
        }
        else {System.out.println("invalid number for hour ! ! !");}
        
        this.minute = minute;
        this.second = second;
        
    }
    
    //Acess methods
    public void setHour(int hour){
    
        this.hour = hour;
        
    }
    public int getHour(){
    
        return hour;
    }
    
    public void setMinute(int minute){
        if ( 0 <= minute & minute < 60){
            this.minute = minute;
        }
        else{System.out.println("invalid number for minute ! ! !");}
    }
    public int getMinute(){
    
        return minute;
    }
    
    public void setSecond(int second){
    
        this.second = second;
    }
    public int getSecond(){
    
        return second;
    }
}
