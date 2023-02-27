/*
* compare shape perimeter class implement Comparator
* */
public class PerimComparator implements Comparator<Shape> {

    /**
     * compare shape perimeter
     *
     * @param item1      item1 is a shape
     * @param item2      item2 is a shape
     * @return           negative item1's perimeter < item2's perimeter
     *                   positive item1's perimeter > item2's perimeter
     *                   zero item1's perimeter = item2's perimeter
     */
    @Override
    public int comparator(Shape item1, Shape item2) {
        double perimItem1 = item1.perimeter();
        double perimItem2 = item2.perimeter();

        if (perimItem1 < perimItem2) {
            return -1;
        } else if (perimItem1 > perimItem2) {
            return 1;
        } else {
            return 0;
        }

    }

}
