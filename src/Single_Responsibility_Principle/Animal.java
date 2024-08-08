package Single_Responsibility_Principle;

public abstract class Animal {
    private int age;
    private String species;

    public void breathe() {
        System.out.println("takes o2 and releases co2");
    }

    public abstract void run();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
