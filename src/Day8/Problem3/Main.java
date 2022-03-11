package Day8.Problem3;
import java.util.Scanner;
public class Main {
    public Hotel provideFood(int amount){
        if(amount>1000){
            return new TajHotel();
        }
        else if(amount>200 && amount<=1000){
            return new RoadSideHotel();
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Amount Below:");
        int amount = scan.nextInt();

        Hotel preferredHotel = mainObj.provideFood(amount);
        if(preferredHotel != null){
            if(preferredHotel instanceof TajHotel){
                TajHotel tajHotel = (TajHotel) preferredHotel;
                tajHotel.welcomeDrink();
                preferredHotel.chickenBiryani();
                preferredHotel.masalaDosa();
            }
            else {
                preferredHotel.chickenBiryani();
                preferredHotel.masalaDosa();
            }

        }
        else {
            System.out.println("Please Enter a valid amount");
        }

    }
}
