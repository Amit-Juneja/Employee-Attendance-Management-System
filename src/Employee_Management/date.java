/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_Management;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author acer
 */
public class date {
   private static final DateFormat sdf = new SimpleDateFormat("yyyy");
   private static final DateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
   
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(sdf.format(date));
        String d=sdf.format(date);
        System.out.println(d);
        System.out.println(sdf1.format(date));

       

    }

    
}
