import jdk.internal.util.xml.impl.Input;

public class PetRock {
    private String name;
    private boolean happy = false;
    private Double height;

    public Double getHeight()
    {
        return height;
    }

    public void setHeight(Double height)
    {
        this.height = height;
    }

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
        return "PetRock{" + "name='" + name + '\'' + ", happy=" + happy + ", height=" + height + '}';
    }
}
