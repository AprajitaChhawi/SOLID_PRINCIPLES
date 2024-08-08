package Single_Responsibility_Principle;

public class Cheetah extends Animal{
    @Override
    public void run() {
        System.out.println("I am the fastest");
    }

    public static void main(String[] args){
        Cheetah c = new Cheetah();
        c.setAge(50); // quite old cheetah !!
        c.breathe();
        c.run();
        System.out.println(c.getAge());
    }
}
