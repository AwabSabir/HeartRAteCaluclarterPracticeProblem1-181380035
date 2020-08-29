/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Awab Sabir
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first Name");
        String firstName=scan.nextLine();
        System.out.println("Enter the Scecond name");
        String secondName=scan.nextLine();
        
        System.out.println("Enter your date of birth year");
        int year=scan.nextInt();
        System.out.println("Enter your date of birth Month in number");
        int month=scan.nextInt();
        System.out.println("Enter your date of birth day in number");
        int day=scan.nextInt();
        LocalDate date= LocalDate.of(year, month, day);
  
       HeartRate user1=new HeartRate("Awab", "Sabir", date);
      
        
               user1.print();
    }
    
}
