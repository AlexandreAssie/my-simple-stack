package deqo.votre_quadrigramme;

import java.util.EmptyStackException;

public interface SimpleStack {
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty();

    /*
    * Returns the number of items in this stack
     */
    public int getSize();

    /*
    * Pushes an item onto the top of this stack
    * null item
     */
    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;
}
