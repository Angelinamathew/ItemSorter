package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparable<Item> {
    public int compareTo(Item o1,Item o2) {
        return (int) (o1.getId() - o2.getId()) ;
    }

    @Override
    public int compareTo(Item o) {
        return 0;
    }
}
