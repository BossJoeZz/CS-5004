import jdk.internal.util.xml.impl.Input;

public class PetRock {
    private String name;
    private boolean happy = false;
    private Double height;

    /**
     * getter method
     * @param
     * @return height
     */
    public Double getHeight()
    {
        return height;
    }

    /**
     * setter method
     * @param height
     * @return
     */
    public void setHeight(Double height)
    {
        this.height = height;
    }

    /**
     * setter method
     * @param name
     * @return
     */
    public PetRock(String name) {
        this.name = name;
    }

    /**
     * getter method
     * @param
     * @return name
     */
    public String getName() {
        return name;
    }

    /** getter method
     * @param
     * @return happy
     */
    public boolean isHappy() {
        return happy;
    }

    /**
     * @param
     * @return
     */
    public void playWithRock() {
        happy = true;
    }

    /**
     * @param
     * @return
     */
    @Override
    public String toString() {
        return "PetRock{" + "name='" + name + '\'' + ", happy=" + happy + ", height=" + height + '}';
    }
}
