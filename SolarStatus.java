//Hackathon_1 question 2b
import java.util.Scanner;
public class SolarStatus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of Energy generated (in kWh): ");
        double Energy=sc.nextDouble();
        if(Energy>=10){
            System.out.println("Good Energy Generation");
        }
        else{
            System.out.println("Low Energy Generation");
        }
        sc.close();
    }
}
