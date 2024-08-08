package Open_Close_Principal;

import Liskov_Subs_Principle.AdvancedCar;
import Liskov_Subs_Principle.BasicCar;
import Liskov_Subs_Principle.ElectricCar;
import Single_Responsibility_Principle.Animal;

import java.util.Scanner;

public class ZooDemo {
    public static void main(String[] args) {
        Animal b = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a bird");
        int carChoice = sc.nextInt();
        if(carChoice==1){
            b= new Dolphin();
        } else if (carChoice==2) {
            b=new Penguin();
        }else {
            b=new Vulture();
        }
        b.run();
    }
}
