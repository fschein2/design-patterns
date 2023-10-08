package iterator;

import java.util.Stack;

/**
 * defines StackIterator
 * @author Fred Schein
 */
public class StackIterator {
    private Stack<String> items;
    private int position;

    /**
     * creates an instance of StackIterator
     * @param items which is a Stack of Strings
     */
    public StackIterator(Stack<String> items) {
        this.items = items;
    }

    /**
     * gets the next item in the Stack
     * @return next which is a String of the next item in the Stack
     */
    public String next() {
        String next = items.get(position);
        position++;
        return next;
    }

    /**
     * checks to see if the Stack has another item
     * @return a boolean that is false if we are at a position that is greater than 
     * the size or if that item is null otherwise it returns true
     */
    public boolean hasNext() {
        if(position >= items.size() || items.get(position) == null) {
            return false;
        }

        return true;
    }
}
