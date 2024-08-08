package Liskov_Subs_Principle;

import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args){
        BasicCar c= null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a car");
        int carChoice = sc.nextInt();
        if(carChoice==1){
            c= new BasicCar();
        } else if (carChoice==2) {
            c=new AdvancedCar();
        }else {
            c=new ElectricCar();
        }
        c.run();

    }
}
