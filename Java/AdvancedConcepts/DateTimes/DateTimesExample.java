package AdvancedConcepts.DateTimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/// How to Work With Dates & Times using Java
///  (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

//   public class DateTimesExample {
//   public static void main(String[] args) {
//
//       // for Printing Date
//       // LocalDate.now() gets the current system date
//       LocalDate date = LocalDate.now();
//
//       System.out.println(date);
//
//       // For Printing Time
//      //  LocalTime.now() gets the current system time
//       LocalTime time = LocalTime.now();
//       System.out.println(time);
//
//       // For Printing Both Date & Time
//       // LocalDateTime.now() combines date + time
//       LocalDateTime dateTime = LocalDateTime.now();
//       System.out.println(dateTime);
//
//       // Instant.now() gives current moment in UTC (Universal Time Coordinated)
//       Instant instant = Instant.now();
//       System.out.println(instant);
//}
//}

/// Ex -2 - Custom Date/Time Format
public class DateTimesExample {
   public static void main(String[] args) {

   LocalDateTime dateTime = LocalDateTime.now();

   // Custom Date & Time
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

  // newDateTime is NOT a date anymore — it is a String.
   String newDateTime = dateTime.format(formatter);

       System.out.println(newDateTime);



}
}
