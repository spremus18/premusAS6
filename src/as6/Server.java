/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as6;

 import as6.model.Employee;
import as6.model.Schedule;
import as6.model.TimeSlot;

/**
 *
 * @author csc190
 */
public class Server {
    protected static void updateSchedule(String val){
        String qry = "UPDATE objects SET val='" + val +"' WHERE schedule='menu'";
        Utils.execNonQuery(qry);
    }
    protected static int uploadSchedyle(String id){
        
        String qry = "SELECT val FROM objects WHERE name='schedule'";
        String scheduleObjStr = Utils.execQuery(qry);
        
        
        
        
        if(ScheduleObjStr==null) return -2;
        Schedule schedule = (schedule) Utils.toObj(scheduleObjStr);
        if(schedule==null) return -3;
        Schedule schedule = schedule.getEmployeeById(id);
        if(id==null) return -1;
        TimeSlot timeslots = timeslots.getTimeSlot();
        if(timeslots==null) return -1;
        return timeslots.uploadSchedule();
    }
    public static void main(String [] args){
        String op = args[0];
        if(op.equals("uploadSchedule")){
            uploadSchedule(args[1]);
        }else{
            int time = uploadSchedule(args[1]);
            System.out.println(time);
        }
    }
}