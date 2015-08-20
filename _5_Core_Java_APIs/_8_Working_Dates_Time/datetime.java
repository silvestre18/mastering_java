/* This file will explain how to use date and time in java */

import java.time.*;     // you have to use this
import java.time.format.*;
class datetime
{
  public static void main(String aa[])
  {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    
    LocalDate ld1 = LocalDate.of(2005,Month.JANUARY,12);
    System.out.println(ld1);
    LocalDate ld2 = LocalDate.of(2006,12,23);
    System.out.println(ld2);
    LocalTime lt1 = LocalTime.of(23,34,45,348478478);
    System.out.println(lt1);
    LocalDateTime ldt1 = LocalDateTime.of(ld1,lt1);
    System.out.println(ldt1);
    
    // Manipulating dates and time
    
    System.out.println(ld1.plusYears(3));
    System.out.println(ld1.minusYears(5));
    System.out.println(ld1.plusMonths(43));
    System.out.println(ld1.minusMonths(23));
    System.out.println(ld1.plusWeeks(13));
    System.out.println(ld1.minusWeeks(12));
    System.out.println(ld1.plusDays(16));
    System.out.println(ld1.minusDays(12));
    
    System.out.println(lt1.plusSeconds(234));
    System.out.println(lt1.minusSeconds(234));
    System.out.println(lt1.plusNanos(12345));
    System.out.println(lt1.minusNanos(137284682342432l));
    System.out.println(lt1.plusMinutes(2345));
    System.out.println(lt1.minusMinutes(1347));
    System.out.println(lt1.plusHours(23));
    System.out.println(lt1.minusHours(234));
    
    
    // All of the latter methods are applied to LocalDateTime as well
    
    Period p =Period.ofYears(2);
    Period p1 = Period.ofMonths(4);
    Period p2 = Period.ofWeeks(45);
    Period p3 = Period.ofDays(234);
    
    System.out.println(ld1.plus(p));
    
    //isBefore isAfter
    
    System.out.println(ld1.isAfter(ld1.minusDays(3)));
    System.out.println(lt1.isBefore(lt1.plusNanos(278378)));
    
    // get
    
    System.out.println(ld1.getYear());
    System.out.println(ld1.getMonth());
    System.out.println(ld1.getDayOfWeek());
    System.out.println(ld1.getDayOfMonth());
    System.out.println(ldt1.getYear());
    System.out.println(ldt1.getMonth());
    System.out.println(lt1.getSecond());
    System.out.println(lt1.getNano());
    System.out.println(lt1.getMinute());
    
    
    // format
    
    System.out.println(ld1.format(DateTimeFormatter.ISO_LOCAL_DATE));
    System.out.println(lt1.format(DateTimeFormatter.ISO_LOCAL_TIME));
    System.out.println(ldt1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    
    DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    System.out.println(dtf.format(ld1));
    
        
    DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    System.out.println(dtf1.format(ld1));
    
    DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    System.out.println(dtf2.format(lt1));
    
    DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
    System.out.println(dtf3.format(lt1)); 
    
    DateTimeFormatter dtf4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    System.out.println(ldt1.format(dtf4));
    
    
    DateTimeFormatter dtf5 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    System.out.println(ldt1.format(dtf5));
    

    DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("mm hh ss");
    System.out.println(dtf6.format(ldt1));
    
    LocalDateTime datetime1 = LocalDateTime.parse("2005-11-23T12:45");
    
    LocalTime datetime2 = LocalTime.parse("05 11 23",dtf6);
    System.out.println(datetime2);
    
    LocalDate date1 = LocalDate.parse("2005-11-23");
    System.out.println(date1);
    
    LocalTime time1 = LocalTime.parse("02:34:45.23");
    System.out.println(time1);

    
    
  
  }

}