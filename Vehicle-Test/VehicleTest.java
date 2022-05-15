import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Vehicle Vehicle1 = new Vehicle();
        Vehicle Vehicle2 = new Vehicle();
        int userMiles;




        // Setting Vehicle 1's year, miles, and mpg
        Vehicle1.setYear(2008);
        Vehicle1.setMiles(300);
        Vehicle1.setMpg(20);

        // Setting Vehicle 2's year, miles, and mpg
        Vehicle2.setYear(2015);
        Vehicle2.setMiles(350);
        Vehicle2.setMpg(24);

        // Vehicle 1 Drive
        System.out.println("The vehicle's year is " + Vehicle1.getYear() + ". The miles is " + Vehicle1.getMiles() + ". The mpg is " + Vehicle1.getMpg() + "." );
        System.out.println("Enter how many miles you want to drive.");
        userMiles = scnr.nextInt();
        Vehicle1.setMiles(userMiles);
        Vehicle1.drive(userMiles);
        System.out.println("You drove the vehicle " + Vehicle1.getMiles() + " miles.");

        // Vehicle 2 Drive
        System.out.println("The vehicle's year is " + Vehicle2.getYear() + ". The miles is " + Vehicle2.getMiles() + ". The mpg is " + Vehicle2.getMpg() + "." );
        System.out.println("Enter how many miles you want to drive.");
        userMiles = scnr.nextInt();
        Vehicle2.setMiles(userMiles);
        Vehicle2.drive(userMiles);
        System.out.println("You drove the vehicle " + Vehicle2.getMiles() + " miles.");

    }


}
