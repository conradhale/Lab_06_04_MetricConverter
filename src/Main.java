import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double meters = 0;

    System.out.print("Enter measurement in meters: ");
    if (in.hasNextDouble()) {
      meters = in.nextDouble();
    } else {
      String invalid = in.nextLine();
      System.out.println("You entered '" + invalid + "', which is invalid. Please try again.");
      System.exit(-1);
    }

    double miles = meters / 1609;
    System.out.println(miles + " miles");

    double feet = meters * 3.281;
    System.out.println(feet + " feet");

    double inches = meters * 39.37;
    System.out.println(inches + " inches");

  }
}