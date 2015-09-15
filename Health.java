import java.util.Scanner;

public class health {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      long userAgeYears = 0;
      long userAgeDays  = 0;
      long userAgeHours = 0;
      long userAgeMinutes = 0;
      long userAgeSeconds = 0;
      long userAgeHeartBeats = 0;
      
      System.out.println("Enter your age in years: ");
      userAgeYears = scnr.nextLong();
      
      userAgeDays = userAgeYears * 365;
      userAgeHours = userAgeDays * 24;
      userAgeMinutes =userAgeHours * 60;
      userAgeSeconds = userAgeMinutes * 60;
      userAgeHeartBeats = userAgeMinutes * 76;
      
      System.out.println("You are " + userAgeDays + " days old.");
      System.out.println("You are " + userAgeHours + " hours old.");
      System.out.println("You are " + userAgeMinutes + " days old.");
      System.out.println("You are " + userAgeSeconds + " seconds old.");
      System.out.println("You are " + userAgeHeartBeats + " heart beats old.");
      
      return;
   }
}
