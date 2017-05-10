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
public class Schedule implements java.io.Serializable{
    protected Employee [] Employee;
    public Schedule(Employee [] inpEmployee){
        this.Employee = inpEmployee;
    }
    public Employee[] getEmployee(){
        return this.Employee;
    }
}