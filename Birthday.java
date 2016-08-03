//Milind Pathiyal


import java.util.*;
public class Birthday
{
    public void calculate()
    {
        // Enter Year/Month/Day
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = input.nextInt();
        System.out.println("Enter a Month");
        int month = input.nextInt();
        System.out.println("Enter a Date");
        int date = input.nextInt();
        
        // Calculation
        int lastTwo = year % 100;
        int firstTwo = year / 100;
        int monthVariation = 13*(month+1)/5;
        int leapYear = lastTwo/4;
        int leapCentury = firstTwo/4-2*firstTwo;
        int day = date + lastTwo + monthVariation + leapYear + 
        leapCentury;
        day = day + 70;
        day = day % 7;
        
        // Final output
        System.out.print(month);
        System.out.print("-");
        System.out.print(date);
        System.out.print("-");
        System.out.print(year);
        System.out.print(" falls on day ");
        System.out.println(day);
        System.out.println("KEY : 0 is Saturday, 1 is Sunday, etc.");
    }
}

/*
Enter a Year
2015
Enter a Month
8
Enter a Date
27
//calculation begins here
15
20
23
3
-35
//calculation ends here
8-27-2015 falls on day 5
KEY : 0 is Saturday, 1 is Sunday, 2 is Monday, etc.
 */