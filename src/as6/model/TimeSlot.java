/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as6.model;

/**
 *
 * @author csc190
 */
public class TimeSlot implements java.io.Serializable {
    protected String Day;
    protected int hour;
    public TimeSlot(String inpDay, int inpHour){
        this.Day = inpDay;
        this.hour = inpHour;
    }
}
