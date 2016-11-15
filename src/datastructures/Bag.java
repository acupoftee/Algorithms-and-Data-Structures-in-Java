package datastructures;

/**
 * Created by diakabanab on 11/13/2016.
 *
 * A Bag is a collection of objects in no particular order. Bags can contain duplicate objects.
 */
public interface Bag<T> {

    /**
     * Gets the number of items in the bag
     * @return number of items in bag
     */
    public int size();

    /**
     * Checks whether or not the bag has reached maximum capacity
     * @return true if the bag is full
     */
    public boolean isFull();

    /**
     * Checks if the bag has zero objects
     * @return true if the bag is empty
     */
    public boolean isEmpty();

    /**
     * Adds a new object to the bag
     * @param item
     * @return true if the bag added the object
     */
    public boolean add(T item);





}
