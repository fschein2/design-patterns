package iterator;

import java.util.Stack;

public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public Document(String title) {
        this.title = title;
    }

    public String makeChange(String change) {
        return "Making change: " + change;
    }

    public String undoChange() {

        return "";
    }

    public boolean canUndo() {
        return !(undoStack.isEmpty());
    }

    public String redoChange() {
        
        return "";
    }

    public boolean canRedo() {
        return !(redoStack.isEmpty());
    }

    public StackIterator getUndoIterator() {
        return new StackIterator(undoStack);
    }

    public StackIterator getRedoIterator() {
        return new StackIterator(redoStack);
    }
}
