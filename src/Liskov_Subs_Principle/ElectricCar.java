package Liskov_Subs_Principle;

public class ElectricCar extends BasicCar{
    @Override
    public void run() {
        System.out.println("Starting Electric Car engine");
    }
}
