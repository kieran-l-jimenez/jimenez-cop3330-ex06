import java.util.Scanner;
import java.time.LocalDate;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Retirement Calculator" output
 *What is your current age? 25
 *At what age would you like to retire? 65
 *You have 40 years left until you can retire.
 *It's 2015, so you can retire in 2055.
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        System.out.print("What is your current age? ");
        int curAge = in.nextInt();
        System.out.print("At what age would you like to retire? ");
        int retAge = in.nextInt();

        myApp.calculate(curAge, retAge);
    }

    public void calculate(int current, int retired)
    {
        System.out.printf("You have %d years left until you can retire.\n", retired - current);
        int currentYear = LocalDate.now().getYear();
        System.out.printf("It's %d, so you can retire in %d.\n", currentYear, currentYear + (retired - current));
    }
}