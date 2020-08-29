/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javafx.util.converter.LocalDateStringConverter;

/**
 *
 * @author Awab Sabir
 */
public class HeartRate {
    private String firstName;
    private String secondName;
    private LocalDate dob;
    
    public HeartRate(String firstName,String secondName, LocalDate dob){
        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setDob(dob);
        
    }
   //setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

  
   
    
    
   
    //getter

    public String getFirstName() {
        return firstName;
    }
     public String getSecondName() {
        return secondName;
    }

    public LocalDate getDob() {
        return dob;
    }

   

    
    
    private int getAge(){
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate currentdate;
        Date dob= Date.from(this.getDob().atStartOfDay(defaultZoneId).toInstant());
        LocalDate dt=LocalDate.now();
          currentdate=dt;
          Date ctdate=Date.from(currentdate.atStartOfDay(defaultZoneId).toInstant());
        DateFormat formate=new SimpleDateFormat("yyyyMMdd");
      int d1=Integer.parseInt(formate.format(dob));
      int d2=Integer.parseInt(formate.format(ctdate));
      int age=(d2-d1)/10000;
        return age;
     
           
        
    }
    public int maxheartRate(){
        return ((220-this.getAge()));
    }
    
    public void print(){
        System.out.println("The user data is: " + "\n"
                + "--------------"
                + "\n" + "The name is: " + this.getFirstName() + "\n"
                + "The Second name: " + this.getSecondName()+ "\n"
                        + "Current age now: " + this.getAge()+ "\n"
                                + "This is your maximum heartRate: " + this.maxheartRate());
        }
    
}
