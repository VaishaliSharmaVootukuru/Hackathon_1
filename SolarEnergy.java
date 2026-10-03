//Hackathon_1 question 2c
import java.util.Scanner;
public class SolarEnergy { //calculation method
    public static double calculateEnergy(double morningEnergy,double eveningEnergy){
        return morningEnergy+eveningEnergy;
    }
    public static void main(String args[]){ //main method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the morning energy:");
        double morning=sc.nextDouble();
        System.out.println("Enter the evening energy:");
        double evening=sc.nextDouble();

        double totalEnergy=calculateEnergy(morning,evening);//calling the method
        System.out.println("The total energy generated is "+totalEnergy+" kWh");

        sc.close();
    }
}
