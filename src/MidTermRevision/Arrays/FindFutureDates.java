package MidTermRevision.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class FindFutureDates {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        ArrayList<String> weekdays = new ArrayList<>();
        weekdays.add("Sunday");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        System.out.print("Enter today's day: ");
        int todayDay = obj.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int ElapsedDays = obj.nextInt();
        int futureDayidx = todayDay + ElapsedDays;
        System.out.println("Today is " + weekdays.get(todayDay) + " AND the future day is "+ weekdays.get(futureDayidx));




    }
}
