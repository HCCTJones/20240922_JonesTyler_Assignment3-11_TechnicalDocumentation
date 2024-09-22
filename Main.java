import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a month: ");
    int month = input.nextInt();

    System.out.print("Enter a year: ");
    int year = input.nextInt();

    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    int daysInMonth;

    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    switch (month) {
      case 2:
        daysInMonth = isLeapYear ? 29 : 28;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        daysInMonth = 30;
        break;
      default:
        daysInMonth = 31;
    }

    System.out.println(monthNames[month - 1] + " " + year + " has " + daysInMonth + " days");
  }
}