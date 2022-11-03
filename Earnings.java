import javax.swing.JOptionPane;
import java.util.Scanner;        

public class Earnings {
    private static String enterFirstName, enterLastName, userInput;
    private static int userHours;
    private static double userHourlyWage;
    public static void main(String[] args) {


        double userHourlyWage;

        double userWage;

        enterFirstName = getImputName();  
       
        enterLastName = getLastName();

        userWage = getWorkingTitme();

        userHourlyWage = getHourlyIncome(userWage);

        userWage = userHours * userHourlyWage;

        getData(userHourlyWage, userWage);

        System.exit(0);
    }
    
    public static String getImputName() {
        
        String userName;

        userName = JOptionPane.showInputDialog(

            "Hi there! Enter your first name: "

        );
        return userName;
    }
    public static String getLastName()
    {
        String lastName;

        lastName = JOptionPane.showInputDialog(

        " Okay give me your last name: "

        );

        return lastName;
    }

    public static double getWorkingTitme()
    {
        userInput = JOptionPane.showInputDialog("How many hours do you worked this week?");
        userHours = Integer.parseInt(userInput);

        return userHours;


    }

    
    public static double getHourlyIncome(double userHourlyWage)
    {
        userInput = JOptionPane.showInputDialog("How much you get paid an hour? ");
        userHourlyWage = Double.parseDouble(userInput);

        return userHours;
    }

    public static void getData(double userHourlyWage, double userWage) {
        

        JOptionPane.showMessageDialog(null, String.format("Hello " + enterFirstName + " " + enterLastName+ " your weekly earnings are " + userWage + "$"));
    }
}
