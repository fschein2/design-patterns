package iterator;

import java.util.Stack;
import java.util.Iterator;

public class StackIterator implements Iterator {
    private Stack<String> items;
    private int position;

    public StackIterator(Stack<String> items) {
        this.items = items;
    }

    public String next() {
        String next = items.get(position);
        position++;
        return next;
    }

    public boolean hasNext() {
        if(position >= items.size() || items.get(position) == null) {
            return false;
        }

        return true;
    }
}
