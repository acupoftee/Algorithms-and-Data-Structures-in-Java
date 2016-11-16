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

    /**
     * Removes no particular object from the bag
     * @return the object to be removed
     */
    public T remove();

    /**
     * Removes an occurrence of a particular object from the bag
     * @param item
     * @return true if the occurrence of the object is removed
     */
    public boolean remove(T item);

    /**
     * Removes all items from the bag
     * @return true if the bag is cleared
     */
    public boolean clear();

    /**
     * Counts the number of occurrences of a particular object
     * @param item
     * @return the number of times a particular object appears in the bag
     */
    public int count(T item);

    /**
     * Checks if the bag contains the specified object
     * @param item
     * @return true if the bag contains the object
     */
    public boolean contains(T item);

    /**
     * Returns an array of all the entries
     * @return an array of all the bag items
     */
    public T[] toArray();

}
