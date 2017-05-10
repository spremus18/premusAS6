/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as6;

import com.google.gson.Gson;
import as6.model.Employee;
import as6.model.Schedule;
import as6.model.TimeSlot;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 *
 * @author csc190
 */
public class Client {

    protected static Schedule buildSchedule(Schedule schedule) {
       List<int> EmployeeID = new ArrayList<>();
       List<String> SkillsEmployee = new ArrayList<>();
       List<int> EmployeeTime = new ArrayList<>();
       Employee listEmployee = new Employee[];
       {
          new Employee(101,"Dr. Evil", SkillsEmployee1, EmployeeTime1), 
          new Employee(102,"Mini Me", SkillsEmployee2, EmployeeTime2),
          new Employee(103, "Number Two", SkillsEmployee3, EmployeeTime3),
          new Employee(104, "Austin Powers", SkillsEmployee4, EmployeeTime4)
    }; 
    Schedule new schedule = Schedule(listEmployee);
     return schedule;
    }

    /**
     * Serialization. Convert Menu to byte array, and then encode using base64
     *
     * @param schedule
     * @return
     */
    protected static String ScheduleToStr(Schedule schedule) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(schedule);
            byte[] barrOut = bos.toByteArray();
            byte[] b64Out = Base64.getEncoder().encode(barrOut);
            int len1 = barrOut.length;
            int len2 = b64Out.length;
            String sRet = new String(b64Out);
            sRet = URLEncoder.encode(sRet, "UTF-8");
            return sRet;
        } catch (Exception exc) {
            System.out.println(exc);
            return null;
        }
    }

    protected static String ScheduleToJsonStr(Schedule schedule) {
        try {
            Gson gson = new Gson();
            String sRet = gson.toJson(schedule);
            sRet = new String(Base64.getEncoder().encode(sRet.getBytes()));
            sRet = URLEncoder.encode(sRet, "UTF-8");
            return sRet;
        } catch (Exception exc) {
            System.out.println(exc);
            return null;
        }

    }

    public static void main(String[] args) {
        String op = args[0];
        Schedule schedule = buildSchedule();
        String url = "http://localhost/staff.php";
        String scheduleContent = Utils.toStr(schedule);
        String datastr = op.equals("1")
                ? "op=uploadSchedule&val=" + scheduleContent
                : "op=getSchdule"+"&skill="+args[1]+"&day="+args[2]+"&hour="+args[3];
        try {
            String response = Utils.httpsPost(url, datastr);
            System.out.println(response);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        int k = 0;

    }

}