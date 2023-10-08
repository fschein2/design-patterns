package iterator;

import java.util.Stack;

/**
 * Defines Document
 * @author Fred Schein
 */
public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /**
     * Creates an instance of a Document
     * @param title which is a String
     */
    public Document(String title) {
        this.title = title;
        this.undoStack = new Stack<String>();
        this.redoStack = new Stack<String>();
    }

    /**
     * makes a change to the document and adds it to the undoStack Stack
     * @param change which is a String
     * @return a String that the change was made
     */
    public String makeChange(String change) {
        undoStack.push(change);
        return "Making change: " + change;
    }

    /**
     * Undos the most recent change made and pushes it to the redoStack Stack
     * @return a String that the change was undone
     */
    public String undoChange() {
        return "Undoing: " + redoStack.push(undoStack.pop());
    }

    /**
     * checks to see if there is anything in the undoStack Stack
     * @return a boolean that is true if undoStack contains an item or false otherwise
     */
    public boolean canUndo() {
        return undoStack.size() >= 1;
    }

    /**
     * Redos the most recent change that was undone and pushes it to the undoStack Stack
     * @return a String that the change was redone
     */
    public String redoChange() {  
        return "Redoing: " + undoStack.push(redoStack.pop());
    }

    /**
     * checks to see if there is anything in the redoStack Stack
     * @return a boolean that is true if redoStack contains an item or false otherwise 
     */
    public boolean canRedo() {
        return redoStack.size() >= 1;
    }

    /**
     * gets undoStack's Iterator
     * @return a StackIterator that is associated with redoStack
     */
    public StackIterator getUndoIterator() {
        return new StackIterator(undoStack);
    }

    /**
     * gets redoStack's Iterator
     * @return a StackIterator that is associated with redoStack
     */
    public StackIterator getRedoIterator() {
        return new StackIterator(redoStack);
    }
}
