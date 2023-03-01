/*
* create a PetRock class
* */
public class PetRock {
    private String name;

    private boolean happy = false;

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }

    @Override
    public String toString() {
        return "PetRock{" + "name='" + name + '\'' + ", happy=" + happy + '}';
    }

    /*
    * Construct PetRock
    * */
    public PetRock(String name, boolean happy) {
        this.name = name;
        this.happy = happy;
    }
}
