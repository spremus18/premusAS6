/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as6.model;

import as6.TimeSlot;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author csc190
 */
public class Employee implements java.io.Serializable {
    protected int id;
    protected String name;
    protected List<String> Skills = new ArrayList<>(); 
    protected List<TimeSlot> Time_Slot = new ArrayList<>(); 
    public Employee(int inpId, String inpName, ArrayList<String> inpSkills, ArrayList <TimeSlot> inpTime_Slot ){
        this.id = inpId;
        this.name = inpName;
        this.Skills = inpSkills;
        this.Time_Slot = inpTime_Slot;
    }
    public boolean hasSkill(String skill){
        for(int i=0; i < Skills.size();i++){
            return Skills.get(i).equals(skill); 
        }
        return false;
    }
    public boolean hasAvailable (String day, int hour){
        for(int i=0; i < Time_Slot.size(); i++){
            if (Time_Slot.get(i).equals(day) && Time_Slot.get(i).equals(hour)){
                return (Time_Slot.get(i).equals(day) && Time_Slot.get(i).equals(hour));
        }
    }
        return false;
    }
}
