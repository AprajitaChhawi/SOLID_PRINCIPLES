package Single_Responsibility_Principle;

public class Monkey extends Animal {
    @Override
    public void run() {
        System.out.println("Single_Responsibility_Principle.Monkey jumps not runs");
    }

    public static void main(String[] args){
        Monkey m = new Monkey();
        m.setAge(9);
        m.breathe();
        m.run();
        System.out.println(m.getAge());
    }
}
